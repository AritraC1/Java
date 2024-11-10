package Basics;

public class PassingValues {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping the value of a and b are = " + a + " " + b);

        swap(a,b);

        System.out.println("After swapping the value of a and b are = " + a + " " + b); // did not swap

        String name = "Tony";
        changeName(name); // the value of reference variable is passed in this method
        System.out.println(name); // Didn't change name
    }

    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    static  void changeName(String naam) {
        naam = "Bruce"; // Not changing, but creating a new object
    }
}

// NOTES:

/*
    * In Java, There is no Pass-by-ref, there is only Pass-By-Value.
*/

//// In Name Change ->

/*
    *  name is pointing towards the object "Tony"
    *  At first naam is also pointing towards the object "Tony" when we pass it in changeName method
    *  naam is a copy of reference variable
    *  when naam = "Bruce"; now naam is pointing towards a new object which is created i.e. Bruce
    *  So there is no change in name
*/
