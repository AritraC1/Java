package DSA.Searching.Linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] num = {33, 5, 23, 56, 22, 76, -3, 16, -11, 6, 28};
        int target = -3;

        int ans = linearSearch(num, target);
        System.out.println(ans);

    }

    // Search in the array: Return the index if item found
    // otherwise if not found then return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i<arr.length; i++){
            // check for element at every index if it is equal to target
            if (arr[i] == target) {
                return i;
            }
        }

        // Since we do not have a use of index so we changed it to enhanced for loop
        for (int j : arr) {
            // check for element at every index if it is equal to target
            if (j == target) {
                return j;
            }
        }

        // this line will execute if none of the above lines have executed
        // hence target not found
        return -1;
    }
}
