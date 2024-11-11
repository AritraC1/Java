package Patterns;

import java.util.Scanner;

public class SymmetricVoid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        symmetricVoidPattern(n);
    }

    private static void symmetricVoidPattern(int n) {

        // Upper Half

        int space = 0;

        for (int i = 0; i<n; i++) {

            //for printing the stars in the row.
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }

            //for printing the stars in the row.
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }

            space = space+2;

            System.out.println();

        }

        // Lower Half

        space = 2*n-2;

        for (int i = 1; i<=n; i++) {

            //for printing the stars in the row.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for(int j=0; j<space; j++){
                System.out.print(" ");
            }

            //for printing the stars in the row.
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            space = space-2;

            System.out.println();
        }
    }
}
