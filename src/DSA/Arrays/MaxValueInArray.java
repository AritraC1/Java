package DSA.Arrays;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 34, 53, 70, 6, 87, 100, 65, 43, 67, 90};

        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 1, 5));
    }

    // Maximum in range
    static int maxInRange(int[] arr, int start, int end) {

        // Edge cases if the array is null
        if (end > start || arr == null) {
            return  -1;
        }


        int maxVal = arr[start];

        for (int i = start; i<end; i++){
            if (arr[i] > maxVal) maxVal = arr[i];
        }

        return maxVal;
    }


    // maximum in array
    static int max(int[] arr) {
        int maxVal = arr[0];

        for (int i = 1; i<arr.length; i++){
            if (arr[i] > maxVal) maxVal = arr[i];
        }

        return maxVal;
    }
}
