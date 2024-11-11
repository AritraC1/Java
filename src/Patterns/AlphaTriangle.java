package Patterns;

import java.util.Scanner;

public class AlphaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        alphaTrianglePattern(n);
    }

    private static void alphaTrianglePattern(int n) {
        for (int i = 0; i<n; i++) {

            for(char ch = (char) ('A'+n-1-i); ch<=(char) ('A'+n-1); ch++){

                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
