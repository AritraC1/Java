package Java8Features;

public class Lambdas {
    public static void main(String[] args) {

        Greeting greeting = () -> System.out.println("Say Hello");
        greeting.sayHello();

        Sum sum = (a,b) -> System.out.println(a+b);
        sum.add(2,5);

        StringLength stringLength = (String::length);
        System.out.println("Length of the string is " + stringLength.getLength("World"));
    }
}
