package DSA.Searching.Binary;

// The floor of a number: x
// x is the greatest integer less than or equal to x

// In simpler terms, it’s the largest whole number that is less than or equal to the given number.

// For example:
// Floor of 3.7 is 3.
// Floor of -2.3 is -3.

public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;

        System.out.println(floorOfANumber(arr, target));
    }

    private static int floorOfANumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;

        // Edge case: if array is empty
        if (arr.length == 0) {
            return -1;  // No floor exists
        }

        while(start <= end){
            int mid = start + (end-start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }

            else if (target > arr[mid]){
                start = mid + 1;
            }

            else {
                return mid;
            }
        }

        if (end >= 0){
            return arr[end];
        }


        return -1;
    }
}
