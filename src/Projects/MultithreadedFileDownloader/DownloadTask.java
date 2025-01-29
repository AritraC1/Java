package Projects.MultithreadedFileDownloader;

import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadTask implements Runnable{
    private final String fileURL;
    private final String destFile;
    private final long start;
    private final long end;
    private final int threadId;

    public DownloadTask(String fileURL, String destFile, long start, long end, int threadId) {
        this.fileURL = fileURL;
        this.destFile = destFile;
        this.start = start;
        this.end = end;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(fileURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Range", "bytes=" + start + "-" + end);

            // Open file and seek to the correct position
            RandomAccessFile file = new RandomAccessFile(destFile, "rw");
            file.seek(start);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = connection.getInputStream().read(buffer)) != -1) {
                file.write(buffer, 0, bytesRead);
            }

            file.close();
            connection.disconnect();
            System.out.println("Thread " + threadId + " completed downloading.");
        } catch (Exception e) {
            System.err.println("Error in thread " + threadId + ": " + e.getMessage());
        }
    }
}
