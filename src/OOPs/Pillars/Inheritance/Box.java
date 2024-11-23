package OOPs.Pillars.Inheritance;

public class Box {
    public double l;
    public double h;
    public double w;

    public Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    // cube
    public Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    // using 3 arguments
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void message(){
        System.out.println("Box created");
    }
}
