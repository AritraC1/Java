package Basics;

import java.util.Scanner;

public class FunctionsMethods {
    public static void main(String[] args) {

        // take input of 2 numbers and print sum
        sum(); // calling function via brackets

        int ans = sumOfNum(); // Since SumOfNum is returning an Integer value, I can store it in a Reference variable of data type int.
        System.out.println("The answer is = " + ans);

        String msg = greet();
        System.out.println("The message is: " + msg);

        int ans3 = sumOfThreeNumbers(3,4,5);
        System.out.println("The sum of 3 numbers are = " + ans3);
    }

    //// Methods

    // Void Method - No return statement i.e. does not return any value. It performs a task but doesn't give anything back to the caller.
    static void sum() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println(sum);
    }

    // Return-type Method / Non-void type Method / Data-type Method
    // A data type method returns a value of a specific data type (e.g., int, String, boolean, etc.).
    static int sumOfNum() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        return a+b;
    }

    static String greet(){

        // Method 1 of writing
        // String greeting = "How are you?";
        // return greeting;

        // Method 2 : Local variable was redundant
        return "How are you?"; // inline
    }

    // Passing the value of numbers when you are calling the method in main - We do this by passing parameters
    static int sumOfThreeNumbers(int a, int b, int c) {
        int sum = a+b+c;
        return sum;
    }
}

//// Method vs Function

// A Method is a function defined within a class
// while a Function is a general term for a block of code that performs a task, but isn't always tied to a class
// i.e a function can exist independently of a class
// In java every method is a function, but not every function is a method