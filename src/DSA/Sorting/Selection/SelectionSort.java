package DSA.Sorting.Selection;

import java.util.Arrays;

// SELECTION SORT

// Swapping with the correct index
// Performs well on small lists/arrays
// Space Complexity : O(1)
// Time Complexity :
    // Best Case [O(N^2)]
    // Worst Case [O(N^2)]
// Not stable

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted part of the array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        return arr;
    }
}
