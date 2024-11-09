package Practice;

import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

            int num = sc.nextInt(); // Number
            int search = sc.nextInt(); // digit you want to search

            int count = 0;

            while (num > 0) {

                int rem = num % 10;

                if (rem == search) {
                    count++; // count = count + 1
                }
                num = num/10;
            }

            System.out.println(count);
        }
    }
}
