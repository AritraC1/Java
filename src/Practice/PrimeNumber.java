package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));
    }

    static boolean isPrime(int n){
        int c = 2;

       if (n<=1) {
           return false;
       }

       while (c*c < n){
           if (n%c == 0) {
               return false;
           }
           c++;
       }
       return true;
    }
}
