package Practice;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(sumOfNNaturalNumbers(N));
    }

    private static int sumOfNNaturalNumbers(int n) {
        int sum = 0;

        for (int i = 1; i<=n; i++) {
            sum = sum + i;
        }

        return sum;
    }
}
