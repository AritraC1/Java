package DSA.Arrays;

// LC Question: https://leetcode.com/problems/matrix-diagonal-sum/description/

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        // Odd Matrix
        int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Even Matrix
//        int[][] mat = {
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}
//        };

        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;

        for (int i = 0; i< mat.length; i++){
            // Primary Diagonal
            sum = sum + mat[i][i];

            // Secondary Diagonal
            sum = sum + mat[i][mat.length - 1 - i];
        }

        if (mat.length % 2 != 0){
            sum = sum - mat[mat.length/2][mat.length/2];
        }

        return sum;
    }
}
