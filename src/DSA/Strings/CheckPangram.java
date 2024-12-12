package DSA.Strings;

// LC Question: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/

// Pangram: A pangram is a sentence where every letter of the English alphabet appears at least once.

import java.util.Scanner;

public class CheckPangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.next();

        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
//        My Code

//        boolean[] letterFound = new boolean[26];
//
//        for (int i = 0; i<sentence.length(); i++){
//           char c = sentence.charAt(i);
//           letterFound[c-'a'] = true;
//        }
//
//        for (boolean found : letterFound){
//            if (!found){
//                return false;
//            }
//        }
//
//        return true;

//        Optimised Code
        for (int i = 97; i<=122; i++){
            if (sentence.indexOf(i) == -1){
                return false;
            }
        }

        return true;
    }
}
