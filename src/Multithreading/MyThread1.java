package Multithreading;

// Method 1: Creating threads using RUNNABLE INTERFACE
public class MyThread1 implements Runnable {
    // Since this is an interface, so we have to override the inbuilt "run() method"
    @Override
    public void run() {
        // task for thread
        for(int i = 1; i<=10; i++){
            System.out.println("Value of i is " + i);
            try {
                Thread.sleep(1000); // pauses the execution of the current thread for a specified period of time i.e. 1000 millisecond
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
