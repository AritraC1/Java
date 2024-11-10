package Practice;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(factorial(num));
    }

    private static long factorial(int num) {

        if (num == 1 || num == 0) return 1;

        long ans = 1;

        for (int i = 1; i<=num; i++) {
            ans = ans * i;
        }

        return ans;
    }
}
