package Multithreading;

// There are total 3 threads - Main Thread, MyThread1, MyThread2

public class Main {
    public static void main(String[] args) {

        // Method 1: Creating threads using RUNNABLE INTERFACE
        // creating object of my thread1 class
        MyThread1 t1 = new MyThread1();
        // t1.start(); // wont work as MyThread1 has no "start" method, so we will make a helper class

        // Helper class
        Thread thread1 = new Thread(t1);
        thread1.start();

        // Method 2: Creating threads using THREAD CLASS
        // creating object of my thread2 class
        MyThread2 t2 = new MyThread2();
        t2.start(); // This will run as the main class Thread already has "inbuilt start" method, so no helper class is required
    }
}
