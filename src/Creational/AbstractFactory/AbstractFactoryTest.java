package Creational.AbstractFactory;

/**
 * Абстрактная фабрика (Abstract factory) - Класс, который представляет собой интерфейс для создания других классов.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbsFactoryCarPrice factoryCarPrice = new AbsFactoryCarPrice();
        Lada lada = factoryCarPrice.getLada();
        Ferrari ferrari = factoryCarPrice.getFerrari();
        Porsche porsche = factoryCarPrice.getPorsche();

        System.out.println(lada.getLadaPrice());
        System.out.println(ferrari.getFerrariPrice());
        System.out.println(porsche.getPorschePrice());

    }
}
