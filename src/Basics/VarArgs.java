// Variable Arguments (Varargs)

package Basics;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,6,7,8);
        fun(); // Empty array
    }

    // When you don't know how many Integers are you passing we use Variable Length Arguments (Varargs) - ...v
    static void fun(int ...v){ // internally it is taking an array of integers (depending on data type)
        System.out.println(Arrays.toString(v)); // v is implicitly declared as an array of type int
    }
}
