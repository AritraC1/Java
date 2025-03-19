package CollectionsFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(32);
        pq.offer(19);
        pq.offer(5);
        pq.offer(7);
        pq.offer(16);

        System.out.println(pq); // default: min to max - [5, 7, 19, 32, 16], here top priority = least element i.e. 5

        pq.poll(); // removes 5
        System.out.println(pq);
        System.out.println(pq.peek()); // next that will be removed

        // To change the priority of the queue, we have to pass a comparator in the constructor
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder()); // converts min-heap to max-heap

        pq1.offer(32);
        pq1.offer(16);
        pq1.offer(19);
        pq1.offer(5);
        pq1.offer(7);

        System.out.println(pq1);

    }
}
