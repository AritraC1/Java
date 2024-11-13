
/*
Problem Statement -
You are given all numbers between 1,2,....,n except one. Your task is to find the missing number.

Input : The first input line contains an integer n. The second line contains n-1 numbers. Each number is distinct and
between 1 and n (inclusive).
Output : Print the missing number.

Problem URL : https://cses.fi/problemset/task/1083

Time limit: 1.00 s
Memory limit: 512 MB

Constraints : 2 <=n <= 2 * 10^5

Example-

Input:
5
2 3 1 5

Output:
4

*/



package DSA.Practice.CSES;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum_n = n * (n + 1) / 2;

        int sum_provided = 0;

        for (int i = 0; i < n - 1; i++) {
            sum_provided += sc.nextInt();
        }

        int missing_number = sum_n - sum_provided;

        System.out.println(missing_number);

        // Close the scanner
        sc.close();
    }
}
