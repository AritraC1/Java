package Practice;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {

            int n = sc.nextInt();

            int a = 0;
            int b = 1;

            for (int i = 0; i<n; i++) {

                int c = b + a;
                a = b;
                b = c;

                System.out.print(a + " ");
            }
        }
    }
}
