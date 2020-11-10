package Behavioral.Visitor;

/**
 * Посетитель (Visitor) - Описывает операцию, которая выполняется над объектами других классов.
 * При изменении класса Visitor нет необходимости изменять обслуживаемые классы.
 *
 * Пример в java - java.nio.file.FileVisitor и SimpleFileVisitor.
 */
public class VisitorTest {
    public static void main(String[] args) {
        Car computer = new SportCar();
        computer.accept(new CarVisitor());
    }
}
