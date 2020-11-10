package Creational.Builder;

public class TwoBuilderImp extends Builder {
    public TwoBuilderImp() {
        car = new Car();
    }

    @Override
    public Car carBuilder() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new TwoEngine();
        car.buildEngine(engine);
        return car;
    }
}
