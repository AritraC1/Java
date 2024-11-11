package Patterns;

import java.util.Scanner;

public class AlphaHill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        alphaHillPattern(n);
    }

    private static void alphaHillPattern(int n) {
        for (int i = 0; i<n; i++){

            // Space
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            // Alphabet
            char ch = 'A';
            int breakpoint = (2*i+1)/2;

            for(int j=1; j<=2*i+1; j++){
                System.out.print(ch);

                if(j <= breakpoint) ch++;

                else ch--;
            }

            // Space
            for (int j = 0; j<n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
