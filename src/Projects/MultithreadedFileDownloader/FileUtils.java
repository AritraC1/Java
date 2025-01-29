package Projects.MultithreadedFileDownloader;

import java.net.HttpURLConnection;
import java.net.URL;

// To determine how much data we need to download, we use an HTTP HEAD request to retrieve the Content-Length header.
public class FileUtils {
    public static long getFileSize(String fileURL) throws Exception {
        URL url = new URL(fileURL);

        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("HEAD");

        long fileSize = connection.getContentLengthLong();
        connection.disconnect();

        return fileSize;
    }
}
