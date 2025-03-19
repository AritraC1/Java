package CollectionsFramework;

import java.util.Vector;

public class VectorCF {
    public static void main(String[] args) {

        // The Vector class implements a growable array of objects. Vectors fall in legacy classes,
        // but now it is fully compatible with collections

        Vector<Integer> v = new Vector<>();

        // Add elements to the vector
        // add(E e) returns boolean (always true in the case of Vector).
        // add() is recommended for new code, as it's part of the standard Collection interface and is more consistent with the rest of the Java Collections Framework.
        // In short - add() belongs to the Collection interface (which is part of the modern Java Collections Framework).
        v.add(1);
        v.add(2);
        v.add(3);

        System.out.println(v);

        // Add elements to the vector
        // addElement(E obj) returns void and doesn't give any indication of success or failure.
        // // addElement() is from the older, pre-JCF days of Java, while add() is the more modern method part of the Collection interface
        // In short - addElement() belongs to the Vector class
        v.addElement(4);
        v.addElement(5);

        System.out.println(v);

        // Insert an element at index 1
        v.insertElementAt(7, 0);
        System.out.println(v);

        // Remove the element at index 2
        v.removeElementAt(3);
        System.out.println(v);

        // Print the elements of the vector
        for (int i : v) {
            System.out.println(i);
        }

        // To create a vector whose initial capacity is specified by size. Eg - 5
        int size = 5;
        Vector<Integer> v1 = new Vector<Integer>(size);

        // To create a vector whose initial capacity is specified by size and increment is specified by increment.
        // It specifies the number of elements to allocate each time a vector is resized upward.
        int increment = 2;
        Vector<Integer> v2 = new Vector<Integer>(size, increment);

        // To creates a vector that contains the elements of collection c.
        // Vector<E> v = new Vector<E>(Collection c);
    }
}
