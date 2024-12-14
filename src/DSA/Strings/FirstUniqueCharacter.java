package DSA.Strings;

// LC Ques: https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=a6dmaeq1

import java.util.Scanner;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(firstUniqueChar(s));
    }

    public static int firstUniqueChar(String s) {

        int[] freq = new int[26];
        char[] chars = s.toCharArray();

        for (char c : chars){
            freq[c - 'a']++;
        }

        for (int i = 0; i < chars.length; i++) {
            if(freq[chars[i] - 'a'] == 1){
                return  i;
            }
        }

        return -1;
    }
}
