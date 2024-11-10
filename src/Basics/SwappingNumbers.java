package Basics;

public class SwappingNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping the value of a and b are = " + a + " " + b);

        swap(a,b);

        System.out.println("After swapping the value of a and b are = " + a + " " + b); // did not swap
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
