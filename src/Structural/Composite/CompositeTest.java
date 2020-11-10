package Structural.Composite;

/**
 * Компоновщик (Composite) - Объект, который объединяет в себе объекты, подобные ему самому.
 * Пример в java - метод add(Component) у java.awt.Container.
 */

public class CompositeTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car unknownCar = new UnknownCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("Green");
        drawing.clear();
        drawing.add(sportCar);
        drawing.add(unknownCar);
        drawing.draw("Red");
    }
}
