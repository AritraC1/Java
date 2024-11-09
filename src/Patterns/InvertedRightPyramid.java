package Patterns;

import java.util.Scanner;

public class InvertedRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        invertedRightPyramidPattern(n);
    }

    static void invertedRightPyramidPattern(int n) {
        for (int i = 0; i<n; i++) {
            for (int j = n; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
