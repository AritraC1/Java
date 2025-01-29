package Projects.MultithreadedFileDownloader;

public class Main {
    public static void main(String[] args) {
        String fileURL = "https://example.com/largefile.zip";
        String destinationFile = "largeFile.zip";
        int numThreads = 10;

        MultiThreadedDownloader downloader = new MultiThreadedDownloader(fileURL, destinationFile, numThreads);
        downloader.downloadFile();
    }
}
