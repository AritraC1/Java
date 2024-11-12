package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SwapValuesInAnArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 34, 53, 70, 6, 87, 100, 65, 43, 67, 90};

        System.out.print("Enter index1 & index 2 = ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

     static void swap(int[] arr, int a, int b) {

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
     }

}
