package Patterns;

import java.util.Scanner;

public class ReverseLetterTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        reverseLetterTrianglePattern(n);
    }

    static void reverseLetterTrianglePattern(int n) {
        for (int i = 0; i<n; i++) {
            for (char ch = 'A'; ch <= 'A'+(n-i-1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
