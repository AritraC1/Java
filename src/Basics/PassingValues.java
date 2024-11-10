package Basics;

import java.util.Arrays;

public class PassingValues {
    public static void main(String[] args) {

        // In Java, There is no Pass-by-ref, there is only Pass-By-Value.


//        int a = 10;
//        int b = 20;
//
//        System.out.println("Before swapping the value of a and b are = " + a + " " + b);
//
//        swap(a,b);
//
//        System.out.println("After swapping the value of a and b are = " + a + " " + b); // did not swap
//
//        String name = "Tony";
//        changeName(name); // the value of reference variable is passed in this method
//        System.out.println(name); // Didn't change name

        // Creating an Array
        int[] arr = {1, 2, 4, 3, 6, 5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr)); // toString is a method which converts objects into strings

    }

    static void changeValue(int[] nums){
        nums[0] = 99;
    }

//    static void swap(int a, int b){
//        int temp = a; // cannot access temp out this swap method - This is called scoping
//        a = b;
//        b = temp;

            // this change will only be valid in this function scope only
//    }
//
//    static void changeName(String naam) {
//        naam = "Bruce"; // Not changing, but creating a new object
//    }

    /*
     *  name is pointing towards the object "Tony"
     *  At first naam is also pointing towards the object "Tony" when we pass it in changeName method
     *  naam is a copy of reference variable
     *  when naam = "Bruce"; now naam is pointing towards a new object which is created i.e. Bruce
     *  So there is no change in name
     */
}

