package OOPs.Pillars.Polymorphism;

public class MethodOverloading {

    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b, int c ){
        return a + b + c;
    }

    // Automatically converts 'int b' into a double
    double sum(double a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        System.out.println(obj.sum(6,4));
        System.out.println(obj.sum(6,4,7));

        System.out.println(obj.sum(6.89,4)); // here 4 is converted to 4.00

//        obj.sum(6,4,8,6); error

    }
}
