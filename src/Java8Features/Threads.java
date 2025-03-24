package Java8Features;

public class Threads {
    public static void main(String[] args) {

        // Thread 1: Thread John
        Runnable thread1 = () -> {
          // Body of the thread
          // task
          for (int i = 0; i<10; i++) {
              System.out.println("Value of i = " + i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };

        Thread thread = new Thread(thread1);
        thread.setName("John");
        thread.start();
    }
}
