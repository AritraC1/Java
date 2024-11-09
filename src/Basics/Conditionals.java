package Basics;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if (age > 18) {
                System.out.println("Adult");
            }
            else if (age == 0) {
                System.out.println("Not Born");
            }
            else {
                System.out.println("Kid");
            }
        }
    }
}
