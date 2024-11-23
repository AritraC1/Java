package OOPs.StaticExamples;

// Works fine even without static -
//class Test {
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}

public class InnerClasses {
    // Inner Class - class k ander class
    // it has to be static because it is itself dependent on the outer class, if we do not want to use static
    // then we have to put the class Test outside the outer-class
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Spider Man");
        Test b = new Test("Peter Parker");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

// Outside classes cannot be static (Will show error)

// static class A {
//
//}