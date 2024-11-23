package OOPs.Singleton;

public class Test {
    public static void main(String[] args) {

        // Here all three reference variables - obj, obj1, obj2 are pointing to the one (same) object
        Singleton obj = Singleton.getInstance();

        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();
    }
}
