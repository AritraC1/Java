package DSA.Arrays;

import java.util.Arrays;

// Prefix Sum is used to optimise the time complexity of many array related problems
public class PrefixSum {
    public static void main(String[] args) {

        int[] arr = {3, 7, 2, 5, 8};
        System.out.println(Arrays.toString(calculatePrefixSum(arr)));
        System.out.println(Arrays.toString(calculateOriginalArrayPrefixSum(arr)));

    }

    public static int[] calculatePrefixSum(int[] arr) {
        int[] prefixSum = new int[arr.length];

        prefixSum[0] = arr[0];

        for (int i = 1; i< arr.length; i++) {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }

        return prefixSum;
    }

    // Sometimes new array is not required and the original array can be modified itself (if memory is constraint)
    public static int[] calculateOriginalArrayPrefixSum(int[] arr) {
        for (int i = 1; i< arr.length; i++) {
            arr[i] = arr[i-1] + arr[i];
        }

        return arr;
    }
}
