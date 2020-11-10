package Behavioral.TemplateMethod;

public class TwoCar extends Car {
    @Override
    void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop engine");
    }
}
