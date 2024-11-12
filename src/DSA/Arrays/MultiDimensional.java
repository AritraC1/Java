package DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {

         /*
                1 2 3
                4 5 6
                7 8 9
         */

        // Syntax -> int[][] arr = new int[rows][column];
        // int[][] arr1 = new int[3][3]; // Adding rows is mandatory, add columns is not because size of the individual array may vary

        // Writing directly

        /*

        int[][] arr2 = {
                {1, 2, 3}, // Oth index
                {4, 5, 6}, // 1st index
                {7, 8, 9} // 2nd index
        };

        */

        Scanner sc = new Scanner(System.in);

        // Input
        int[][] arr2D = new int[3][3];

        for (int row = 0; row<arr2D.length; row++){
            // For Each column in every row
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = sc.nextInt();
            }
        }

        // output
//        for (int row = 0; row<arr2D.length; row++){
//            // For Each column in every row
//            for (int col = 0; col < arr2D[row].length; col++) {
//                System.out.print(arr2D[row][col] + " ");
//            }
//            System.out.println();
//        }

        // Output using enhanced loop
        for (int[] row : arr2D) {
            // For Each column in every row
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Using Arrays.toString
//        for (int row = 0; row<arr2D.length; row++){
//            // For Each column in every row
//            System.out.println(Arrays.toString(arr2D[row]));
//        }

        // Using Arrays.toString with enhanced loop
        for (int[] num : arr2D) {
            // For Each column in every row
            System.out.println(Arrays.toString(num));
        }

    }
}
