package DSA.Arrays;

import java.util.Scanner;
// import java.util.Arrays;

public class Arrays {
    public static void main(String[] args) {

        // Arrays

        // Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable.
        // They are useful for managing collections of data efficiently.

        // Syntax
        // data_type[] variable_name = new data_type[size];

        // storing 5 numbers
        // int[] num = new int[5]; // Here int represents the type of data stored in the array

        // Directly assigning the numbers in the array
        // int[] rollNo = {1, 2, 3, 4, 5}; // Here int represents the type of data stored in the array

        // int[] ros; // Declaration of array: ros is getting defined in the STACK
        // ros = new int[5]; // Initialization: Object is being created in the HEAP memory.

        // System.out.println(ros[1]);

        // If we don't put anything in the array with size 5
        // then internally array will be {0, 0, 0, 0, 0}

        // String[] arr = new String[4];
        // System.out.println(arr[3]); // returns null, Null is a special literal, can be cast to any particular reference type, Can only be assigned to non primitives


        // Taking input

        Scanner sc = new Scanner(System.in);

        int n = 5; // size of the array (use arr.length if the size of the length is unknown)

        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // Internally: [1,2,3,4,5]
        System.out.println(arr[3]);

        // System.out.println(arr[7]); // index out of bound error

        // input using for loops
        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        // printing the array
//        for(int i = 0; i<n; i++) {
//            System.out.print(arr[i] + " ");
//        }

        // Directly accessing the values using an enhanced for loop : For each loop
        for (int i : arr){ // i belongs(:) to arr and for every element in array print the element
            System.out.print(i + " "); // 'i' represent the element of the array
        }

        // Easy way printing the array (Only works if the file name is not Arrays)
       // System.out.println(Arrays.toString(arr)); // Array class has a toString method when you give an array into it, it converts into a string and prints that string

        // Array of Objects
        String[] str = new String[4];
        for(int i = 0; i< str.length; i++) {
            str[i] = sc.next();
        }

        for (String i : str){
            System.out.print(i + " ");
        }

    }
}
