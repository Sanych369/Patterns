package Behavioral.TemplateMethod;

/**
 * Шаблонный метод (Template method) - Определяет основу алгоритма и
 * позволяет наследникам переопределять некоторые шаги алгоритма, не изменяя его структуру в целом.
 *
 * Пример в java - все не абстрактные методы java.io.InputStream,
 * java.io.OutputStream, java.io.Reader java.io.Writer.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        Car car = new OneCar();
        Car car1 = new TwoCar();
        car.start();
        car1.startEngine();
    }
}
