package lecture5.Interfaces;

public class Car implements Engine, Brakes {
    @Override
    public void start() {
        System.out.println("Car just started");
    }

    @Override
    public void Drifttt() {

    }


    @Override
    public void stop() {
        System.out.println("Car just stopped");

    }

    @Override
    public void accelerate() {
        System.out.println("Bhruuum Bhruuuuum");
    }
}
