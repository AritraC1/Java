package DSA.Arrays;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        int k = 2;

        System.out.println(subArraySum(arr, k));
    }

    public static int subArraySum(int[] nums, int k) {

        /*
        int[] prefixSum = new int[nums.length+1];
        prefixSum[0] = nums[0];

        for (int i = 0; i < nums.length; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        int count = 0;


        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if (prefixSum[j] - prefixSum[i] == k) {
                    count++;
                }
            }
        }

        return count;

         */

        // Optimised Solution

        HashMap<Integer, Integer> map = new HashMap<>();
        // this helps handle sub-arrays that start from index 0.
        map.put(0, 1);

        int total = 0, count = 0;

        for (int n : nums) {
            total = total + n;

            if (map.containsKey(total - k)) {
                count = count + map.get(total - k);
            }

            map.put(total, map.getOrDefault(total, 0) + 1);
        }

        return count;
    }
}
