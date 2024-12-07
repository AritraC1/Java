package DSA.Searching;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};

        int ans = searchInRange(1,4, arr, -7);
        System.out.println("target number found at index " + ans);
    }

    // Searching for a number in a specific range of indexes
    static int searchInRange(int start, int end, int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        // run a loop from start to end indexes in the array
        for (int i = start; i <=end ; i++) {
            if (arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
