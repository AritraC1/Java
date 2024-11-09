package Practice;

import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            char ch = sc.next().charAt(0); // Character input

            if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Upper Case");
            }
            else if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lower Case");
            }
            else {
                System.out.println("Invalid");
            }
        }
    }
}
