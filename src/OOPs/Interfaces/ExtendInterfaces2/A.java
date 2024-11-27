package OOPs.Interfaces.ExtendInterfaces2;

public interface A {

    // static interfaces methods should always have a body
    // call via the interface name
    static void greeting(){
        System.out.println("Hey I am Static Method");
    }

    // this is used to provide a means for interfaces to be expanded without breaking the existing code
    default void fun(){
        System.out.println("I am in A");
    }
}
