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
        int count = 0;
        while(num>0){
            count++;
            num /= 10;
        }

        return count;
    }
}