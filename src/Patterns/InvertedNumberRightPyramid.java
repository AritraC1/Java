package Patterns;

import java.util.Scanner;

public class InvertedNumberRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        invertedNumberRightPyramidPattern(n);
    }

    static void invertedNumberRightPyramidPattern(int n) {
        for (int i = 0; i<n; i++) {
            for (int j = n; j>i; j--) {
                System.out.print(n-j+1 + " ");
            }
            System.out.println();
        }
    }
}
