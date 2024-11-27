package OOPs.Interfaces;

public class Main {
    public static void main(String[] args) {
        // What things you access depends on first half - Car car/Engine car
        // Which version to be access depends on 2nd half - new Car()
        // Car car = new Car();

        // Engine car = new Car(); // possible

//        car.start();
//        car.acc();
//        car.brake();
//        car.stop();

        CustomCar customCar = new CustomCar();

        customCar.start();
        customCar.startMusic();
        customCar.upgradeEngine();
        customCar.start();


    }
}
