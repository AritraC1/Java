package OOPs.AccessControls;

public class Main {
    public static void main(String[] args) {
        A obj = new A(15, "Tony");

        // Accessing the data members
        System.out.println(obj.getNum());

        // Modifying the data members
        obj.setNum(12);
        System.out.println(obj.getNum());
    }
}
