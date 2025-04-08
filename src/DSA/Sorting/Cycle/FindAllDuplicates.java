package DSA.Sorting.Cycle;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findAllDuplicates(arr));
    }

    public static List<Integer> findAllDuplicates(int[] arr) {

        int i = 0;

        // Cyclic Sort
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // Finding duplicate numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }

        return ans;

    }

    // Swap Function
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
