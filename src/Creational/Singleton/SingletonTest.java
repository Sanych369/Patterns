package Creational.Singleton;

/**
 * Одиночка (Singleton) - Класс, который может иметь только один экземпляр.
 * Пример в java - метод getDesktop() у Desktop.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setUp();
        Singleton singleton1 = Singleton.getInstance();
//        singleton1.setUp();
        System.out.println(singleton == singleton1); //ссылаются на один и тот же объект
    }
}
