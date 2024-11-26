package OOPs.Pillars.Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Creating a Car object
        Car myCar = new Car("Toyota Corolla", 0);

        // Accessing the private variables through getter methods
        System.out.println("Car model: " + myCar.getModel());
        System.out.println("Current speed: " + myCar.getSpeed() + " km/h");

        // Changing the speed using setter
        myCar.setSpeed(50);
        System.out.println("Updated speed: " + myCar.getSpeed() + " km/h");

        // Using the methods to accelerate and brake
        myCar.accelerate();
        myCar.brake();
    }
}
