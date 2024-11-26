package OOPs.Pillars.Encapsulation;

// Car class that demonstrates Encapsulation
class Car {
    // Private variables
    private String model;
    private int speed;

    // Constructor to initialize the Car object
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Getter method for 'model'
    public String getModel() {
        return model;
    }

    // Setter method for 'model'
    public void setModel(String model) {
        this.model = model;
    }

    // Getter method for 'speed'
    public int getSpeed() {
        return speed;
    }

    // Setter method for 'speed'
    public void setSpeed(int speed) {
        if (speed >= 0) {  // We don't want a negative speed
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    // Method to accelerate the car
    public void accelerate() {
        speed += 10;
        System.out.println("The car has accelerated. New speed: " + speed + " km/h.");
    }

    // Method to apply brakes
    public void brake() {
        if (speed > 0) {
            speed -= 10;
            System.out.println("The car has slowed down. New speed: " + speed + " km/h.");
        } else {
            System.out.println("The car is already at a stop.");
        }
    }
}

