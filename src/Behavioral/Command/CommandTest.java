package Behavioral.Command;

/**
 * Команда (Command) - Позволяет инкапсулировать различные операции в отдельные объекты.
 * Пример в java - все реализации java.lang.Runnable.
 */
public class CommandTest {
    public static void main(String[] args) {
        Car car = new Car();
        StartCar startCar = new StartCar(car);
        StopCar stopCar = new StopCar(car);
        CarInvoker carInvoker = new CarInvoker(startCar);
        carInvoker.execute();
        carInvoker = new CarInvoker(stopCar);
        carInvoker.execute();
    }
}
