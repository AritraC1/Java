package Basics;

import java.util.Arrays;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(12);
        fun("Tony");

        System.out.println(sum(2,3));
        System.out.println(sum(3,5,6));

        demo(2, 3, 4, 5, 6, 10);
        demo("Mango", "Banana", "Apple");

    }

    // Method Overloading happens when two or more methods with same name exists if the parameters are different (Cannot be of same data type)
    static void fun(int a){
        System.out.println("The number is = " + a);
    }

    static void fun(String name){
        System.out.println("The name is = " + name);
    }

    static int sum(int a, int b) {
        return a+b;
    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
