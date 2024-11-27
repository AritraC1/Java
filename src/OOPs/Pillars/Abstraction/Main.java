package OOPs.Pillars.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career("Engineer");
        son.partner("Pepper Potts", 27);

        Daughter daughter = new Daughter(28);
        daughter.career("Doctor");
        daughter.partner("Tony Stark", 30);

        // Objects of abstract class cannot be created
        // Parent mom = new Parent(); // error

        // We need to make overridden methods for these
//        Parent mom = new Parent(12) {
//            @Override
//            void career(String name) {
//
//            }
//
//            @Override
//            void partner(String name, int age) {
//
//            }
//        };

        Parent.hello();




    }
}
