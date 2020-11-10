package Creational.FactoryMethod;

/**
 * Фабричный метод (Factory method) - Делегирует создание объектов наследникам родительского класса.
 * Это позволяет использовать в коде программы не специфические классы,
 * а манипулировать абстрактными объектами на более высоком уровне.
 */
public class FactoryTest {
    public static void main(String[] args) {
        String win = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
        OS os1 = factory.getCurrentOS("mac");
        os1.getOS();
        OS os2 = factory.getCurrentOS("windows");
        os2.getOS();
    }
}
