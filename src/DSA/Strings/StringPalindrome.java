package DSA.Strings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder(sc.nextLine()); // StringBuilder Input

        String original = input.toString().toLowerCase();
        String rev = input.reverse().toString().toLowerCase();

        if (original.equals(rev)) System.out.println("True");
        else System.out.println("False");
    }
}
