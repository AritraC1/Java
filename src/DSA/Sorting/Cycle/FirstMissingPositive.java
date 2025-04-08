package DSA.Sorting.Cycle;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
        System.out.println(firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;

        // Cyclic Sort
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // finding the first positive
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                return index+1;
            }
        }

        return arr.length+1;
    }

    // Swap Function
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
