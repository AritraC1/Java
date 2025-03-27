package Multithreading;

// Method 2: Creating threads using THREAD CLASS
public class MyThread2 extends Thread{
    public void run(){
        // task for thread
        for (int i = 10; i>=1; i--){
            System.out.println("Value of i is " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
