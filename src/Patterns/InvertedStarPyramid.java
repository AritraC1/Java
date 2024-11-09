package Patterns;

import java.util.Scanner;

public class InvertedStarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        invertedStarPyramidPattern(n);
    }

    static void invertedStarPyramidPattern(int n) {
        for (int i = 0; i<n; i++) {
            // Space
            for (int j =0; j<i; j++) {
                System.out.print(" ");
            }

            // Star
            for(int j=0;j< 2*n -(2*i +1);j++){
                System.out.print("*");
            }

            // Space
            for (int j =0; j<i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
