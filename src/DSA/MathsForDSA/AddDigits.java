package DSA.MathsForDSA;

// LC Question: https://leetcode.com/problems/add-digits/?envType=problem-list-v2&envId=a6dmaeq1

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(addDigits(num));
    }

    public static int addDigits(int num) {

        if (num == 0) {
            return 0;
        }

        while (num >= 10) {

            int sum = 0;

            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}
