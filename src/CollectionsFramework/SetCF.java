package CollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCF {
    public static void main(String[] args) {

        // It is an unordered collection of objects in which duplicate values cannot be stored.
        // This is so because it works on the concept of hashing.
        // Hashing is the process of converting an object into a unique hash code using a hash function.
        // It is used in data structures like HashMap and HashSet to efficiently store and retrieve data based on the object's hash value.

        //// HashSet
        Set<Integer> set = new HashSet<>(); // Time Complexity - O(1)

        // Add
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        System.out.println(set);

        // Remove
        set.remove(2);
        System.out.println(set);

        // Contains - returns true/false (boolean)
        System.out.println(set.contains(100)); // false
        System.out.println(set.contains(21)); // true

        // to check if the set is empty or not
        System.out.println(set.isEmpty()); // returns true/false (boolean)

        // Size of the set - number of elements in the set
        System.out.println(set.size());

        // to clear the set
        set.clear();
        System.out.println(set.isEmpty());

        System.out.println();

        //// LinkedHashSet
        Set<Integer> linkedSet = new LinkedHashSet<>(); // properties of both hashset and linkedList - so order will be maintained
        // Time Complexity - O(1)
        linkedSet.add(32);
        linkedSet.add(2);
        linkedSet.add(54);
        linkedSet.add(19);
        linkedSet.add(21);
        System.out.println(linkedSet);

        System.out.println();

        //// TreeSet
        Set<Integer> treeSet = new TreeSet<>(); // always in sorted form, Time Complexity - O(logN) as it is implemented using binary search tree
        treeSet.add(32);
        treeSet.add(2);
        treeSet.add(54);
        treeSet.add(19);
        treeSet.add(21);
        System.out.println(treeSet);


    }
}
