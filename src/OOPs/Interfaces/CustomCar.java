package OOPs.Interfaces;

public class CustomCar {
    private Engine engine;
    private Media media = new MusicPlayer();

    public CustomCar() {
        engine = new PetrolEngine();
    }

    public CustomCar(Engine engine) {
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }
}
