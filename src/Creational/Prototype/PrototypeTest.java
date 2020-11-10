package Creational.Prototype;

/**
 * Прототип (Prototype) - Определяет интерфейс создания объекта через клонирование другого объекта
 * вместо создания через конструктор.
 */
public class PrototypeTest {
    public static void main(String[] args) {
        Object prototype = new Object();
        Object clonePrototype = prototype.copy();
        prototype.setType(Type.ONE);
        System.out.println(prototype.getType());
        System.out.println(clonePrototype.getType());
    }
}
