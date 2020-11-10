package Creational.Builder;

public class OneBuilderImp extends Builder {
    public OneBuilderImp() {
        car = new Car();
    }

    @Override
    public Car carBuilder() {
        car.buildBase();
        car.buildWheels();
        Engine engine = new OneEngine();
        car.buildEngine(engine);
        return car;
    }
}
