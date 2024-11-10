package Practice;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
    }

    private static boolean isPalindrome(int num) {

        int revNum = 0;
        int temp  = num;

        while (temp != 0){
            revNum = (revNum * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (revNum == num);
    }
}
