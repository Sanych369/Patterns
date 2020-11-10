package Structural.Composite;

public class SportCar implements Car {
    @Override
    public void draw(String color) {
        System.out.println("SportCar color: " + color);
    }
}
