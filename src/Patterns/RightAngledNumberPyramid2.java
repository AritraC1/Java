package Patterns;

import java.util.Scanner;

public class RightAngledNumberPyramid2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        rightAngledNumberPyramid2Pattern(n);
    }

    static void rightAngledNumberPyramid2Pattern(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
