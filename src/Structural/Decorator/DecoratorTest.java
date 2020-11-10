package Structural.Decorator;

/**
 * Декоратор (Decorator) - Класс, расширяющий функциональность другого класса
 * без использования наследования.
 * Пример в java - java.io.InputStream, OutputStream, Reader и Writer.
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car blueCarDecor = new BlueCarDecorator(new UnknownCar());
        sportCar.draw();
        System.out.println();
        blueCarDecor.draw();

    }
}
