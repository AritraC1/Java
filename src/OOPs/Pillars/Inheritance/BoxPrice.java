package OOPs.Pillars.Inheritance;

public class BoxPrice extends BoxMeasurement{

    int cost;

    BoxPrice(){
        super();
        this.cost = -1;
    }
 
    BoxPrice(BoxPrice other){
        super(other);
        this.weight = other.cost;
    }
}
