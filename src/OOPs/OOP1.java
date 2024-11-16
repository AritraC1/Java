package OOPs;

public class OOP1 {
    public static void main(String[] args) {
        // Class-
        // It is a named group of properties and functions, by convention naming starts with Capital, we can create our own
        // data types using class. It is Basically a template/logical construct.

        // Calling the class
        Student[] students = new Student[5];

        Student Tony = new Student();
    }

    // create a class
    static class Student {
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
    }
}
