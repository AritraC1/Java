package Java8Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {

        // Immutable list - object cannot be modified
        List<Integer> list1 = List.of(2,4,21,24,76,55);
        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(34);
        list2.add(45);
        list2.add(76);
        List<Integer> list3 = Arrays.asList(2,4,50,21,24,76,55);

        // List1 (without stream)
        // Java version 1.7 Method
        List<Integer> listEven = new ArrayList<>();

        for (int i: list1) {
            if (i%2 == 0) {
                listEven.add(i);
            }
        }

        System.out.println(listEven);

        // With Streams
        // Java 8 Version
        Stream<Integer> stream1 = list1.stream(); // can perform bulk operations on this stream
        List<Integer> newList = stream1.filter(i -> i%2 == 0).toList();
        System.out.println(newList);

        // In one line (concise code)
        List<Integer> newList1 = list1.stream().filter(i -> i%2 == 0).toList();
        System.out.println(newList1);
    }
}
