package CollectionsFramework;

import java.util.ArrayList;

// Iterator in Collection Framework
public class IteratorCF {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("The list is: " + list);

        /*
        while (it.hasNext()){
            System.out.println("iterator " + it.next());
        }
        */

        // best way to iterate is -
        for (Integer integer : list) {
            System.out.println("iterator " + integer);
        }

    }
}
