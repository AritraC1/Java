package DSA.Sorting.Cycle;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void cyclicSort(int[] arr) {
        int i = 0;

        while (i<arr.length){
            int correct = arr[i]-1;

            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }

            i++; // else
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
