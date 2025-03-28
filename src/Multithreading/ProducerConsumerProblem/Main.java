package Multithreading.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);

        producer.start();
        consumer.start();
    }
}
