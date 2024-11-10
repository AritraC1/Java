package Basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            String fruit = sc.next();

            // == checks if two references point to the same object
            // .equals() checks if the objects are equal in value (only checks the value & not the reference)
            if (fruit.equals("Mango")) {
                System.out.println("True");
            }else {
                System.out.println("False");
            }

            //// Switch Statements

            /*
                * Duplicate Case values are not allowed
                * cases have to be the same types as expressions, must be constant or literals
                * Break is used to terminate the sequence, if not used it will continue to next case
                * Default will execute when none of the above cases executes.
            */

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

            // RULE SWITCH (Enhanced switch)
            // In Rule switch break statement is not required
            switch (button) {
                case 1 -> System.out.println("Hello");
                case 2 -> System.err.println("Namaste");
                case 3 -> System.out.println("Bonjour");
                default -> System.out.println("Invalid Button");
            }

            // Nested Switch Case (Switch case ke ander switch case)

            int empID = sc.nextInt();
            String department = sc.next();

            switch (empID) {
                case 1 -> System.out.println("Tony Stark");
                case 2 -> System.out.println("Bruce Banner");
                case 3 -> {
                    switch (department) {
                        case "IT" -> System.out.println("IT Department");
                        case "Marketing" -> System.out.println("Marketing Department");
                        case "Finance" -> System.out.println("Finance Department");
                        default -> System.out.println("Enter a valid department");
                    }
                }
                default -> System.out.println("Enter a valid employee ID");
            }
        }
    }
}
