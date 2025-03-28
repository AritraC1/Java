package Multithreading.ProducerConsumerProblem;

public class Consumer extends Thread {

    Company company;

    Consumer(Company company) {
        this.company = company;
    }

    public void run() {
        while(true){
            try {
                this.company.consume_item();
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
