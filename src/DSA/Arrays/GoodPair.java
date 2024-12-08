package DSA.Arrays;

// LC Ques: https://leetcode.com/problems/number-of-good-pairs/description/

public class GoodPair {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};

        System.out.println(goodPair(arr));
    }

    static int goodPair(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
