package Creational.FactoryMethod;

public class LinuxOS implements OS {
    @Override
    public void getOS() {
        System.out.println("Применить для Линукс");
    }
}
