
/*
Problem Statement -
You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition
in the sequence. This is a maximum-length substring containing only one type of character.

Input: The only input line contains a string of n characters.
Output: Print one integer: the length of the longest repetition.

Problem URL : https://cses.fi/problemset/task/1069

Time limit: 1.00 s
Memory limit: 512 MB

Constraints: 1 <= n <= 10^6

Example

Input:
ATTCGGGA

Output:
3

*/

package DSA.Practice.CSES;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next().trim();

        System.out.println(longestRepetition(str));
    }

    private static int longestRepetition(String str) {
        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)){
                currentLen++;
            }
            else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }

        maxLen = Math.max(maxLen, currentLen);

        return maxLen;
    }
}
