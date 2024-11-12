package DSA.Strings;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1245f;
        System.out.printf("Formatted number is %.2f\n", a); // formatted string , % - Placeholder, .2f - how many decimals so here 2

        // Also rounds of
        float b = 453.1575f;
        System.out.printf("Formatted number is %.2f\n", b); // rounds of to 453.16

        // Pi
        System.out.println("The value of PI = " + Math.PI);
        System.out.printf("The value of PI = %.4f\n", Math.PI);

        System.out.printf("I am %s\n", "Iron Man"); // %s for string

        System.out.printf("I am %d years old\n", 12); // %d for integer

    }
}
