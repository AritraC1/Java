package DSA.Sorting.Insertion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(insertionSort(arr)));
    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 0; i< arr.length-1; i++){
            for (int j = i+1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    break; // the left side of j is always sorted
                }
            }
        }

        return arr;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
