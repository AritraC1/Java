package DSA.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        // ArrayList is a part of Collection Framework, and it is similar to vectors in c++
        // It is needed when the size of an array is unknown
        // We cannot pass primitives, we have to pass the Wrapper Classes

        Scanner sc = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

        // ArrayList Functions

        // Add - adds items to the ArrayList
//        list.add(12);
//        list.add(33);
//        list.add(54);
//        list.add(78);
//        list.add(104);
//        list.add(120045);
//        list.add(14);
//        list.add(1254);
//        list.add(765436788);
//        list.add(0);

        // Printing the arraylist
//        System.out.println(list);

        // Contains
//        System.out.println(list.contains(12)); // returns true/false

        // Set
//        list.set(0, 44);

        // Remove
//        list.remove(2);

        // Printing the arraylist
//        System.out.println(list);


        // Size - Length of the list
//        int n = list.size();

        // Input
        for (int i = 0; i< 5; i++) {
            list.add(sc.nextInt());
        }

        // Getting item at any index
        for (int i = 0; i< 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

    }
}
