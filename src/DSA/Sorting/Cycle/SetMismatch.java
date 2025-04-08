package DSA.Sorting.Cycle;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;

        // Cyclic Sort
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        // Finding duplicate numbers
        int[] ans = new int[2];
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index+1) {
                ans[0] = nums[index]; // Duplicate number
                ans[1] = index + 1;   // Missing number
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
