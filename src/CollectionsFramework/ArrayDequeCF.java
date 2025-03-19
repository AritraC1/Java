package CollectionsFramework;

import java.util.ArrayDeque;

public class ArrayDequeCF {
    public static void main(String[] args){

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(32); // adds elements in the last
        adq.offerFirst( 19); // adds elements in the first
        adq.offerLast(16); // adds elements in the last

        System.out.println(adq);

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
    }
}
