package OOPs.AccessControls;

public class A {

    // Data members
    private int num;
    String name;
    int[] arr;

    // Getter - Gets the value which is set to private
    public int getNum() {
        return num;
    }

    // Setter - Sets the value which is set to private
    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int [num];
    }
}
