package Behavioral.Iterator;

/**
 * Итератор (Iterator) - Представляет собой объект, позволяющий получить последовательный доступ
 * к элементам объекта-агрегата без использования описаний каждого из объектов,
 * входящих в состав агрегации.
 *
 * Пример в java - все реализации java.util.Iterator.
 */
public class IteratorTest {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        Iterator iterator = numbers.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
