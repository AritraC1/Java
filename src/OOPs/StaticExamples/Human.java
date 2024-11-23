package OOPs.StaticExamples;

public class Human {
    public int age;
    public String name;
    public int salary;
    public boolean married;

    // Such properties that are independent of object but are common to all the objects of the class we declare those as static
    public static long population = 0;

    // Constructor
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
