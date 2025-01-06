package DSA.Sorting.Bubble;

import java.util.Arrays;

// BUBBLE SORT (Aka SINKING SORT/ EXCHANGE SORT)

// This is an in-place algorithm as No extra space is required so Space Complexity: O(1)
// Time Complexity:
// Best Case [O(N)] - When the array is already sorted
// Worst Case [O(N^2)] - When the array is in descending order & is to be sorted in ascending order

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        // With every pass through the array, the largest element comes in the end
        for (int i = 0; i<n-1; i++){ // Bubble sort condition for outer loop ->from 0 to n-1
            for (int j = 0; j<n-i-1; j++){ // Bubble sort condition for inner loop ->from 0 to n-i-1
                if(arr[j] > arr[j+1]){
                    // Swapping of numbers in place
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
