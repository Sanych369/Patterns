package Creational.Builder;

public class Car {
    public void print(String msg) {
        System.out.println(msg);
    }

    public void buildBase() {
        print("Делаем корпус / каркас");
    }

    public void buildWheels() {
        print("Ставим колесо");
    }

    public void buildEngine(Engine engine) {
        print("Ставим движок: " + engine.getEngineType());
    }
}
