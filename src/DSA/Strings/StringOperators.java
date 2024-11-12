package DSA.Strings;

import java.util.ArrayList;

public class StringOperators {
    public static void main(String[] args) {

        // Character addition
        System.out.println('a' + 'b'); // operator converts a and b into its integer value and adding it
        System.out.println('a' + 3); // 97 + 3 = 100
        System.out.println((char)('a' + 3)); // cast into char

        // String Concatenation
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 1); // a1 - integer will be converted to its wrapper class : Integer that will call toString(). This will result in "a" + "1"

        System.out.println("Tony" + new ArrayList<>()); // Tony[]






    }
}
