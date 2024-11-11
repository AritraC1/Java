package Patterns;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        hollowRectanglePattern(n);
    }

    private static void hollowRectanglePattern(int n) {

        // outer loop for no. of rows.
        for(int i=0; i<n; i++) {

            // inner loop for printing the stars at borders only.
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) System.out.print("*");

                // if not border index, print space.
                else System.out.print(" ");
            }

            System.out.println();
        }
    }
}
