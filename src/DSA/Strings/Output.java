package DSA.Strings;

import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // works on method overloading
        System.out.println(56);
        System.out.println("Mango");
        System.out.println(new int[]{2,3,4,5}); // Textual Printing

        // works on method Overriding
        System.out.println(Arrays.toString(new int[]{2,3,4,5}));
    }
}
