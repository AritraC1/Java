package OOPs.Pillars.Abstraction;

public abstract class Parent {

    int age;

    public Parent(int age) {
        this.age = age;
    }

    // Abstract Constructors cannot be made
    // abstract Parent(); // error

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);

}
