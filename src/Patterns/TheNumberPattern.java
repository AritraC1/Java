package Patterns;

import java.util.Scanner;

public class TheNumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        theNumberPattern(n);
    }

    private static void theNumberPattern(int n) {
        // Outer loop for no. of rows
        for(int i=0; i<2*n-1; i++){

            // inner loop for no. of columns.
            for(int j=0; j<2*n-1; j++){

                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2*n - 2) - j;
                int left = (2*n - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n - Math.min(Math.min(top,bottom), Math.min(left,right)) + " ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }
    }
}
