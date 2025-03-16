package OOPs.Pillars.Inheritance;

//// THE DIAMOND PROBLEM

// This is a concept also known as MULTIPLE INHERITANCE problem.
// This can be solved using Interfaces or Default Methods in JAVA-8.
// This problem is called a Diamond Problem because when visualised it forms a diamond.

// Here is the visual representation
/*
        A
       / \
      B   C
       \ /
        D
*/

// Here A, is the parent/base class
// B and C are inheriting from A.
// D is inheriting from both B & C (together)

// This causes confusion and ambiguity

class A {
    void display() {
        System.out.println("A");
    }
}

class B extends A {
    void display() {
        System.out.println("B");
    }
}

class C extends A {
    void display() {
        System.out.println("C");
    }
}

// This is showing error - Class cannot extend multiple classes
//class D extends B,C {
//    public static void main(String[] args) {
//        D d = new D();
//        d.display();
//    }
//}

//// SOLUTION OF THE DIAMOND PROBLEM

// Interfaces

//interface A {
//    void show();
//}
//
//interface B extends A {
//    void show();  // Overridden in B
//}
//
//interface C extends A {
//    void show();  // Overridden in C
//}
//
//class D implements B, C {
//    // The compiler will show an error here because it doesn't know which 'show' to use.
//    public void show() {
//        System.out.println("Method in D");
//    }
//}
//
//public class DiamondProblem {
//    public static void main(String[] args) {
//        D obj = new D();
//        obj.show();  // Calls the overridden method in D
//    }
//}


// Default Methods

//interface A {
//    default void show() {
//        System.out.println("Show in A");
//    }
//}
//
//interface B extends A {
//    default void show() {
//        System.out.println("Show in B");
//    }
//}
//
//interface C extends A {
//    default void show() {
//        System.out.println("Show in C");
//    }
//}
//
//class D implements B, C {
//    // Resolving ambiguity by overriding the show method
//    @Override
//    public void show() {
//        System.out.println("Show in D");
//    }
//}
//
//public class DiamondProblem {
//    public static void main(String[] args) {
//        D obj = new D();
//        obj.show();  // Calls the overridden method in D
//    }
//}
