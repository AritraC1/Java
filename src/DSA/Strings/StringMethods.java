package DSA.Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Tony Stark Iron Man";

        // Converts into character array
        System.out.println(Arrays.toString(name.toCharArray()));

        // lower case
        System.out.println(name.toLowerCase()); // creates a new object and converts that into lower case, original will not change

        // Upper case
        System.out.println(name.toUpperCase());

        // indexOf
        System.out.println(name.indexOf('S')); // takes characters

        // Strip
        System.out.println("    Mango   ".strip());

        // Split
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
