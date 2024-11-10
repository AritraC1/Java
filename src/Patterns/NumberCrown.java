package Patterns;

import java.util.Scanner;

public class NumberCrown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        numberCrownPattern(n);
    }

    static void numberCrownPattern(int n) {

        int space = 2*(n-1);

        for (int i = 1; i<=n; i++) {
            // Number
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }

            // Space
            for (int j = 1; j<=space; j++) {
                System.out.print(" ");
            }

            // Reverse Number
            for (int j = i; j>=1; j--) {
                System.out.print(j);
            }

            System.out.println();

            space = space - 2;
        }
    }
}
