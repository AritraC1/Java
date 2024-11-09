package Patterns;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        starPyramidPattern(n);
    }

    static void starPyramidPattern(int n) {
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
}
