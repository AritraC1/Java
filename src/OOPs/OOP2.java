package OOPs;

import OOPs.StaticExamples.Human;

public class OOP2 {
    public static void main(String[] args) {
        Human Natasha = new Human(27, "Black Widow", 67000, false);
        System.out.println(Natasha.name);
        System.out.println(Human.population);

        Human Thor = new Human(106, "Thor", 6000, true);
        System.out.println(Thor.name);
        System.out.println(Human.population);

        System.out.println();

        // Static method can only access static things
        // greeting();

        fun();
    }

    // Independent of objects
    static void fun(){
       // greeting(); // you cannot use this because this requires an instance
        // but the function use are using it in does not depend on instances

        // you cannot access non-static stuff without referencing their instances in a static context
        // here I am referencing it
        OOP2 obj = new OOP2();
        obj.greeting();
    }

    // something which is not static belongs to an object
    void greeting(){
        // fun();
        System.out.println("Hello World");
    }
}
