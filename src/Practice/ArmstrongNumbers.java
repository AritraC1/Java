package Practice;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        // printing all 3 digits armstrong numbers

        /*
            * Sum of cube of the digits is equal to the original number then the number is a Armstrong number
            * Eg:- 153
            * Explanation:
            * 153 -> 1^3 + 5^3 + 3^3
            * if (153 == 1^3 + 5^3 + 3^3) True - Armstrong number
        */


        printArmstrong();
    }

    static void printArmstrong(){
        for (int i = 100; i<=999; i++){

            int num = i; // Store the original number
            int sum = 0;

            while (num>0) {
                int rem = num%10;
                int cube = rem * rem * rem;
                 sum += cube;
                 num = num/10;
            }

            // Check if the sum equals the original number
            if (sum == i) {
                System.out.println(i); // Print the Armstrong number
            }
        }
    }
}
