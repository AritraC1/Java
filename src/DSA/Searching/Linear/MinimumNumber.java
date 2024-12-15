package DSA.Searching.Linear;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] arr = {23, 55, 18, 12, -7, 3, 14, 28, 0, -5};

        int ans = minimumNumber(arr);
        System.out.println("Minimum number in array is = " + ans);
    }

    static int minimumNumber(int[] arr) {

        int min = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if (min > arr[i+1]){
                min = arr[i+1];
            }
        }

        return min;
    }
}
