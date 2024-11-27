package OOPs.Interfaces;

public class PetrolEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Petrol Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stop");
    }

    @Override
    public void acc() {
        System.out.println("Petrol Engine vroom vroom");
    }
}
