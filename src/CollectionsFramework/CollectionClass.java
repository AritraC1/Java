package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(14);
        list.add(73);
        list.add(73);
        list.add(38);
        list.add(19);

        System.out.println("Min Element = " + Collections.min(list));
        System.out.println("Max Element = " + Collections.max(list));
        System.out.println("Frequency of 73 = " + Collections.frequency(list, 73));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
