package DSA.Arrays;

// LC 303 -  Range Sum Query - Immutable
public class RangeSumQuery {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Instantiate NumArray object
        NumArray obj = new NumArray(arr);
        int param_1 = obj.sumRange(1, 3);

        // Output result
        System.out.println(param_1);
    }
}

class NumArray {

    // Array to store prefix sum
    int[] prefix;

    // Constructor to initialize and compute prefix sums
    public NumArray(int[] nums) {

        prefix = new int[nums.length];
        prefix[0] = nums[0];

        for (int i = 1; i<nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
    }

    // Method to return sum in the given range [left, right]
    public int sumRange(int left, int right) {

        if (left == 0) return prefix[right];

        // Formula to efficiently calculate the sum of elements in a sub-array from index left to right (inclusive) using prefix sums.
        return prefix[right] - prefix[left-1];
    }
}
