package Multithreading;

// Thread Operations
public class ThreadOps {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program Started");

        int x = 56+34;
        System.out.println("Sum is = " + x);

        // Thread
        Thread t1 = Thread.currentThread();
        System.out.println("Current running thread is " + t1.getName());

        // setName
        t1.setName("MyMain");
        System.out.println("Current running thread is " + t1.getName());

        // sleep() - static method
        Thread.sleep(1000);

        // getId() method
        System.out.println("Id of the thread is " + t1.getId());

        System.out.println("Program Ended");
    }
}
