package Structural.Bridge;

/**
 * Мост (Bridge) - Разделяет реализацию и абстракцию,
 * дает возможность изменять их свободно друг от друга.
 * Делает конкретные классы независимыми от классов реализации интерфейса.
 * Пример в java - метод newSetFromMap() у Collections.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car unknown = new UnknownCar(new UnknownEngine());
        unknown.setEngine();
        System.out.println();
    }
}
