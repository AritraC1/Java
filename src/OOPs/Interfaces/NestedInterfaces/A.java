package OOPs.Interfaces.NestedInterfaces;

public class A {
    // nested interface
    public interface nestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.nestedInterface{

    @Override
    public boolean isOdd(int num) {
        return ((num & 1) == 1);
    }

}

class Main {
    public static void main(String[] args) {
        B obj = new B();

        System.out.println(obj.isOdd(5)); // true
        System.out.println(obj.isOdd(8)); // false

    }
}
