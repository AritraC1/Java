package DSA.Searching;

// LC Question link : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));
    }

    static public int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    // Function to check whether a number contains even digit or not
    static boolean even(int num) {
        int digits = countDigits(num);

        return digits % 2 == 0;
    }

    // Function to count the number of digits
    static int countDigits(int num){
        // if number is less than 0, i.e. negative then make it positive
        if(num < 0) {
            num = num * -1;
        }

        if (num == 0){
            return 1;
        }

        int count = 0;

        while(num>0){
            count++;
            num /= 10;
        }

        return count;
    }

    // Shortcut to find Number of Digits
    static int countDigits2(int num){
        if(num < 0) {
            num = num * -1;
        }

        return (int)(Math.log10(num)) + 1;
    }
}
