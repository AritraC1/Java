package Projects.MultithreadedFileDownloader;

import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedDownloader {
    private final String fileURL;
    private final String destFile;
    private final int numThreads;

    public MultiThreadedDownloader(String fileURL, String destFile, int numThreads) {
        this.fileURL = fileURL;
        this.destFile = destFile;
        this.numThreads = numThreads;
    }

    public void downloadFile() {
        try {
            long fileSize = FileUtils.getFileSize(fileURL);
            System.out.println("File Size: " + fileSize + " bytes");

            // Create an empty file with the expected size
            RandomAccessFile file = new RandomAccessFile(destFile, "rw");
            file.setLength(fileSize);
            file.close();

            // Divide the file into chunks
            long chunkSize = fileSize / numThreads;
            ExecutorService executor = Executors.newFixedThreadPool(numThreads);

            for (int i = 0; i < numThreads; i++) {
                long start = i * chunkSize;
                long end = (i == numThreads - 1) ? fileSize - 1 : (start + chunkSize - 1);
                executor.execute(new DownloadTask(fileURL, destFile, start, end, i + 1));
            }

            executor.shutdown();
            while (!executor.isTerminated()) {
                Thread.sleep(500);
            }

            System.out.println("Download Completed!");
        } catch (Exception e) {
            System.err.println("Error in download: " + e.getMessage());
        }
    }
}
