package OOPs;

import java.util.Arrays;

public class OOP1 {
    public static void main(String[] args) {
        // Class-
        // It is a named group of properties and functions, by convention naming starts with Capital, we can create our own
        // data types using class. It is Basically a template/logical construct.

        // Calling the class
        Student[] students = new Student[5]; // Array of Students

        System.out.println(Arrays.toString(students)); // when not initialised the default value is null

        // Declaring
        /*
            Student bruce;
            bruce = new Student();
        */

        // in one line
        Student Tony = new Student();

        // System.out.println(Tony); // prints random value

        System.out.println(Tony.rollNo); // since not initialised it is returning 0 - by default
        System.out.println(Tony.name); // since not initialised it is returning null - by default
        System.out.println(Tony.marks); // since not initialised it is returning 0.0 - by default

        // Initialising
        Tony.rollNo = 12;
        Tony.name = "IronMan";
        Tony.marks = 100.0f; // if not initialised then it will take the default value which is 50

        System.out.println(Tony.rollNo);
        System.out.println(Tony.name);
        System.out.println(Tony.marks);

        // The above is cumbersome, so we can initialise the value when we are initialising the object using constructors
        Student Bruce = new Student();

        Tony.greeting();
        Bruce.greeting();

        Bruce.changeName("Hulk");
        Bruce.greeting();

        Student Barton = new Student(12, "Hawk Eye", 56);
        System.out.println(Barton.marks);
        System.out.println(Barton.rollNo);
        System.out.println(Barton.name);

        Student Random = new Student(Tony);
        System.out.println(Random.name);
        System.out.println(Random.rollNo);
        System.out.println(Random.marks);
    }

    // create a class
    static class Student {
        int rollNo;
        String name;
        float marks = 50; // Default values

        // we need a way to add the values of the above properties object by object
        // we need one word to access every object - "this" Keyword

        // Constructor (no name and no return type)
        // When you call a constructor with 0 values it will call this block of code below
//        Student () {
//            this.rollNo = 12;
//            this.name = "IronMan";
//            this.marks = 100.0f;
//        }

        // When you call a constructor with 3 values it will call this block of code below
        // Student Tony = new Student();
        // here, this will be replaced wih tony
        Student (int rollNo, String name, float marks) {
            this.rollNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        // This is called constructor overloading or Polymorphism

        // Another constructor that takes values from another object
        Student (Student Random){
            this.name = Random.name;
            this.rollNo = Random.rollNo;
            this.marks = Random.marks;
        }
        
        // Calling a constructor from another constructor
         Student(){
            // this is how you Call a constructor from another constructor
             this(13, "Default", 100.0f);
         }


        //// Functions in a class

        // function in class
        void greeting(){
            System.out.println("Hello! I am " + this.name);
        }

        // change name
        void changeName(String newName){
            this.name = newName;
        }
    }
}
