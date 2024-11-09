package Patterns;

import java.util.Scanner;

public class RectangularStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        rectangularStarPattern(n);
    }

    static void rectangularStarPattern(int n) {
        for (int row = 0; row<n; row++) {
            // For every row, run the column
            for (int col = 0; col<n; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a new line
            System.out.println();
        }
    }
}
