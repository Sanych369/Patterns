package Creational.Singleton;

public class Singleton {
    private static Singleton instanse = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instanse == null) {
            instanse = new Singleton();
        }
        return instanse;
    }
    public void setUp() {
        System.out.println("SetUP!");
    }
}
