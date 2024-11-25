package OOPs.Pillars.Inheritance;

public class BoxMeasurement extends Box{
    public double weight;

    public BoxMeasurement(){
        this.weight = -1;
    }

    public BoxMeasurement(double l, double h, double w, double weight){
        // used to initialise values present in parent class
        super(l,w,h); //  call the parent class constructor
        this.weight = weight;
    }

    public BoxMeasurement(BoxMeasurement other) {
        super(other);
        weight = other.weight;
    }
}
