package Patterns;

import java.util.Scanner;

public class SymmetricButterfly {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        symmetricButterflyPattern(n);
    }

    private static void symmetricButterflyPattern(int n) {

        int spaces = 2*n-2;

        for(int i = 1; i<=2*n-1; i++){

            // stars for first half
            int stars = i;

            // stars for the second half.
            if(i>n) stars = 2*n - i;

            //for printing the stars
            for(int j=1; j<=stars; j++){
                System.out.print("*");
            }

            //for printing the spaces
            for(int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }

            //for printing the stars
            for(int j = 1; j<=stars; j++){
                System.out.print("*");
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();

            if(i<n) spaces -=2;
            else spaces +=2;
        }
    }
}
