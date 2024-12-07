package DSA.Searching;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] arr = {23, 55, 18, 12, -7, 3, 14, 28, 0, -5};

        int ans = maximumNumber(arr);
        System.out.println("Maximum number in array is = " + ans);
    }

    static int maximumNumber(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if (max < arr[i+1]){
                max = arr[i+1];
            }
        }

        return max;
    }
}
