package Basics;

public class Shadowing {
    static int x = 90; // This will be shadowed
    public static void main(String[] args) {
        System.out.println(x); // 90

        int x = 40; // This variable at line 4 is shadowed by this
        System.out.println(x); // 40

        fun();
    }

    static void fun(){
        System.out.println(x); // 90
    }
}
