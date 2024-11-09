package Basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){
            // taking input
            int a = sc.nextInt();
            int b = sc.nextInt();

            // Operator
            int sum = a + b;

            // Output
            System.err.println("The answer is = " + sum);
        }
    }
}
