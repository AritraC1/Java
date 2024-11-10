package Basics;

public class Scopes {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        random();

        // Block Scope
        {
            // already initialised outside the block in the same method, hence you can not initialise again,but you can change the value of it
            a = 23; // re-assigns the origin ref variable to some other value
            int c = 34; // c is only accessible in this scope only
            System.out.println(c); // no error
        }
        // System.out.println(c); // error

        System.out.println(a+b);

        // Loop Scope
        for (int i = 1; i<10; i++) {
            System.out.println(i + " Loop scope");
        }

    }

    static void random() {
        // Method Scope
        // All the variables and methods in a method can only be accessible inside that method
        System.out.println("Method Scope");
    }
}
