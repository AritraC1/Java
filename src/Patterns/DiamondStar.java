package Patterns;

import java.util.Scanner;

public class DiamondStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 2 Parts : Star Pyramid + Inverted Star Pyramid

        // Part A: Star Pyramid
        StarPyramidPattern(n);

        // Part B: Inverted Star Pyramid
        InvertedStarPyramidPattern(n);
    }

    static void StarPyramidPattern(int n) {
        for (int i = 0; i<n; i++) {

            // Space
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            //Star
            for (int j = 0; j <= 2*i; j++){
                System.out.print("*");
            }

            // Space
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    static void InvertedStarPyramidPattern(int n) {
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
