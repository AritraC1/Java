package Basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            int button = sc.nextInt();

            // NORMAL SWITCH
            // In Normal switch break statement is required

            // switch (button) {
            //     case 1: System.out.println("Hello");
            //         break;
            //     case 2: System.err.println("Namaste");
            //         break;
            //     case 3: System.out.println("Bonjour");
            //         break;
            //     default:
            //         System.out.println("Invalid Button");
            // }

            // RULE SWITCH
            // In Rule switch break statement is not required
            switch (button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.err.println("Namaste");
                case 3 -> System.out.println("Bonjour");
                default -> System.out.println("Invalid Button");
            }
        }
    }
}
