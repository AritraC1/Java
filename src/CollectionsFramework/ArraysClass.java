package CollectionsFramework;

import java.util.Arrays;

public class ArraysClass {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 is = " + index);

        int[] arr = {1,3,7,4,5,6,8,9,2};
        System.out.println("Original: " + Arrays.toString(arr));
        Arrays.sort(arr); // using quick sort
        System.out.println("Sorted: " + Arrays.toString(arr));

        // to fill the array with a specific number
        Arrays.fill(numbers, 12);
        System.out.println(Arrays.toString(numbers)); // Prints -> [12, 12, 12, 12, 12, 12, 12, 12, 12]

        for (int i: arr) {
            System.out.print(i + " ");
        }
    }
}
