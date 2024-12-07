package DSA.Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] mat = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
        };

        int[] ans = searchInMatrix(mat, 2);
        if (ans != null) {
            System.out.println("Element found at: (" + ans[0] + ", " + ans[1] + ")");
        } else {
            System.out.println("Element not found");
        }
    }

    static int[] searchInMatrix(int[][] mat, int target) {
        // i -> Row
        // j -> Column
        for (int i = 0; i<mat.length; i++) {
            for (int j = 0; j<mat[i].length; j++) {
                if(mat[i][j] == target){
                    return new int[]{i,j}; // Return the row and column as a 2D index
                }
            }
        }

        return null;
    }
}
