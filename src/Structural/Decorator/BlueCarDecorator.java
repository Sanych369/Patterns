package Structural.Decorator;

public class BlueCarDecorator extends CarDecorator {
    public BlueCarDecorator(Car decoratedCar) {
        super(decoratedCar);
    }
    public void draw() {
        decoratedCar.draw();
        setColor();
    }
    public void setColor() {
        System.out.println("Color: red");
    }
}
