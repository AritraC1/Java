package Projects.ImageExtractor;

// By injecting dependency in maven
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.*;
import java.util.Scanner;

public class ImageDownloader {
    // Create Folder
    public static void folderCreate(Elements images) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Folder Name: ");
        String folderName = scanner.nextLine();

        File folder = new File(folderName);

        // Folder creation (if folder exists, prompt user again)
        if (folder.exists()) {
            System.out.println("Folder already exists with that name. Please choose another.");
            folderCreate(images);
            return;
        }

        if (!folder.mkdirs()) {
            System.out.println("Error creating folder.");
            folderCreate(images);
            return;
        }

        // Image downloading starts after folder creation
        downloadImages(images, folderName);
    }

    // Download all images from the URL
    public static void downloadImages(Elements images, String folderName) {
        int count = 0;

        // Print total images found on the URL
        System.out.println("Total " + images.size() + " Image(s) Found!");

        if (images.isEmpty()) {
            System.out.println("No images found on the page.");
            return;
        }

        // Loop through images and download them
        for (int i = 0; i < images.size(); i++) {
            Element image = images.get(i);
            String imageLink = null;

            // Try fetching image URL using different possible attributes
            String[] attrs = {"data-srcset", "data-src", "data-fallback-src", "src"};
            for (String attr : attrs) {
                if (image.hasAttr(attr)) {
                    imageLink = image.attr(attr);
                    break;  // Exit once we find a valid image URL
                }
            }

            if (imageLink == null || imageLink.isEmpty()) {
                continue;  // Skip to next image if no valid URL is found
            }

            // Try downloading the image
            try {
                URL url = new URL(imageLink);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setConnectTimeout(5000);
                connection.setReadTimeout(5000);

                InputStream inputStream = connection.getInputStream();
                Path outputPath = Paths.get(folderName, "image" + (i + 1) + ".jpg");
                Files.copy(inputStream, outputPath, StandardCopyOption.REPLACE_EXISTING);
                inputStream.close();

                count++;
                System.out.println("Downloaded image " + (i + 1) + " from " + imageLink);
            } catch (IOException e) {
                System.out.println("Failed to download image " + (i + 1) + ": " + e.getMessage());
            }
        }

        // Report result of image download
        if (count == images.size()) {
            System.out.println("All images downloaded successfully!");
        } else {
            System.out.println(count + " out of " + images.size() + " images downloaded.");
        }
    }

    // Main function to parse URL and start download
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String url = scanner.nextLine();

        try {
            // Fetch the URL and parse the HTML
            Document doc = Jsoup.connect(url).get();
            Elements images = doc.select("img");

            // Call folder creation function
            folderCreate(images);
        } catch (IOException e) {
            System.out.println("Error fetching URL: " + e.getMessage());
        }
    }
}
