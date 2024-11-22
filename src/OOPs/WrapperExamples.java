package OOPs;

public class WrapperExamples {
    public static void main(String[] args) {
        // Primitive
        // int a = 10;
        // System.out.println(a);


        // Wrapper Class
        // A wrapper class in Java is a class whose object contains or surrounds primitive data types (primitive as an object)

        // Integer num = new Integer(45); // deprecated

        // Integer num = 45;
        // System.out.println(num);

        Integer a = 12;
        Integer b = 34;

        System.out.println("Before Swap: " + a + " " + b);

        swap(a,b);

        System.out.println("After Swap: " + a + " " + b); // not swapped

        // It is not swapping because the Integer class is a "final" type class i.e. All Wrapper classes are final and immutable

        // Final Keyword
//        final int BONUS = 5;
//        BONUS = 7; // error


        final A tony = new A("Iron Man");
        tony.name = "Genius";

        // When a non primitive is final, you cannot re-assign it
//        tony = new A("Iron Man"); // Cannot be reassigned

        A obj;

        for (int i = 0; i < 1000000000; i++) {
            obj  = new A("Random name");
        }
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{

    // Final variables have to be initialised
    // final int num; // error

    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("object is created");
        this.name = name;
    }


    // Finalization
    // Deprecated version
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }

}
