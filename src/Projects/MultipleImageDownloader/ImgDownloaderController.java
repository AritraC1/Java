package Projects.MultipleImageDownloader;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.*;

public class ImgDownloaderController {

    private final Projects.MultipleImageDownloader.ImgDownloaderLogic logic = new Projects.MultipleImageDownloader.ImgDownloaderLogic();

    // Method to process user input and start downloading images
    public void start(String url) {
        try {
            // Fetch the URL and parse HTML
            Document doc = Jsoup.connect(url).get();
            Elements images = doc.select("img");

            // Get folder name and attempt to create folder
            System.out.print("Enter Folder Name: ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String folderName = reader.readLine();

            boolean folderCreated = logic.createFolder(folderName);
            if (folderCreated) {
                // Proceed to download images after successful folder creation
                logic.downloadImages(images, folderName);
            } else {
                // Retry folder creation if folder already exists
                start(url);  // Recursive call to prompt the user for a new folder name
            }
        } catch (IOException e) {
            System.out.println("Error fetching URL: " + e.getMessage());
        }
    }

}
