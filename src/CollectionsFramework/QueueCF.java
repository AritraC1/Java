package CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCF {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add elements in queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        // Top element
        System.out.println(queue.peek());

        // To remove the top element and return it
        System.out.println(queue.poll());




    }
}
