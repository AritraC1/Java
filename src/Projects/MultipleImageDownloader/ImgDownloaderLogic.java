package Projects.MultipleImageDownloader;

import org.jsoup.nodes.Element;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ImgDownloaderLogic {

    // Create folder function
    public boolean createFolder(String folderName) {
        File folder = new File(folderName);
        if (folder.exists()) {
            System.out.println("Folder already exists with that name. Please choose another.");
            return false;  // Folder already exists
        } else {
            folder.mkdir();
            return true;  // Folder created successfully
        }
    }

    // Download images function
    public void downloadImages(List<Element> images, String folderName) {
        int count = 0;
        System.out.println("Total " + images.size() + " Image(s) Found!");

        if (images.isEmpty()) {
            System.out.println("No images found on the page.");
            return;
        }

        for (int i = 0; i < images.size(); i++) {
            Element image = images.get(i);
            String imageLink = null;

            // Try fetching image URL using different possible attributes
            String[] attributes = {"data-srcset", "data-src", "data-fallback-src", "src"};
            for (String attr : attributes) {
                if (image.hasAttr(attr)) {
                    imageLink = image.attr(attr);
                    break;
                }
            }

            if (imageLink == null) {
                continue;  // Skip if no valid URL is found
            }

            try {
                // Download image
                URL url = new URL(imageLink);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.connect();

                if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    InputStream inputStream = connection.getInputStream();
                    byte[] imageData = inputStream.readAllBytes();
                    String imageFilename = folderName + "/image" + (i + 1) + ".jpg";
                    Files.write(Paths.get(imageFilename), imageData);

                    count++;
                    System.out.println("Downloaded image " + (i + 1) + " from " + imageLink);
                } else {
                    System.out.println("Failed to download image " + (i + 1) + ": " + connection.getResponseMessage());
                }
            } catch (IOException e) {
                System.out.println("Failed to download image " + (i + 1) + ": " + e.getMessage());
            }
        }

        // Report download status
        if (count == images.size()) {
            System.out.println("All images downloaded successfully!");
        } else {
            System.out.println(count + " out of " + images.size() + " images downloaded.");
        }
    }
}
