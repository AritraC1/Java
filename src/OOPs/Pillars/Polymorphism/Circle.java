package OOPs.Pillars.Polymorphism;

public class Circle extends Shapes {
    // Method Overriding
    @Override // this is called annotation, it is used to check if a method is being overridden or not

    // This will run when obj of circle is created, hence it is overriding the parent method
    public void area(){
        System.out.println("Area is pi * r * r");
    }

//    @Override // error as area2 is not overridden
//    public void area2(){
//        System.out.println("Area is pi * r * r");
//    }
}
