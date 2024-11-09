package Practice;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            // Largest of the three numbers :

            // int maxi = Math.max(a, b);
            // int largest = Math.max(maxi, c);

            int ans = Math.max(c, Math.max(a, b));

            System.out.println(ans);
        }
    }
}
