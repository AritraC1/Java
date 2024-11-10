package Patterns;

import java.util.Scanner;

public class AlphaRamp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        alphaRampPattern(n);
    }

    static void alphaRampPattern(int n) {
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<=i; j++) {
                // same char which is defined
                // is to be printed i times in that row.
                System.out.print((char)('A'+i) + " ");
            }
            System.out.println();
        }
    }
}
