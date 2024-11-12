package DSA.Strings;

public class StringComparison {
    public static void main(String[] args) {

        String a = "Mango";
        String b = "Mango";


        // Comparator : ==
        System.out.println(a == b); // prints true

        // String method : .equals()
        System.out.println(a.equals(b)); // prints true

        String c = new String("Apple");
        String d = new String("Apple");

        // Comparator : ==
        System.out.println(c == d); // prints true

        // String method : .equals()
        System.out.println(c.equals(d)); // prints true

    }
}
