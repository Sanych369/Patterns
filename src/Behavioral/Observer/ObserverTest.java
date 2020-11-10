package Behavioral.Observer;

/**
 * Наблюдатель (Observer) - Определяет зависимость типа «один ко многим» между объектами
 * таким образом, что при изменении состояния одного объекта все зависящие от него
 * оповещаются об этом событии.
 *
 * Пример в java - все реализации java.util.EventListener (практически во всем Swing).
 */
public class ObserverTest {
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addStudent("San");
        university.addObserver(director);
        university.addStudent("Lan");
        university.removeStudent("Lan");
        university.removeObserver(director);
        university.removeStudent("Lan");
    }
}
