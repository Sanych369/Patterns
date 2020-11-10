package Structural.Flyweight;

/**
 * Приспособленец (Flyweight) - Вместо создания большого количества похожих объектов,
 * объекты используются повторно. Экономит память.
 *
 * Пример в java - пул строк, а также метод valueOf(int) у java.lang.Integer
 * (также на Boolean, Byte, Character, Short, Long и BigDecimal)
 */
public class FlyweightTest {
    public static void main(String[] args) {
        int rows = 5;
        Factory factory = new Factory(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                factory.getFlyweight(i).report(j);
            }
            System.out.println();
        }
    }
}
