package Behavioral.Mediator;

/**
 * Посредник (Mediator) - Обеспечивает взаимодействие множества объектов,
 * формируя при этом слабую связанность и избавляя объекты от необходимости
 * явно ссылаться друг на друга.
 *
 * Пример в java - метод execute() у java.util.concurrent.Executor.
 */
public class MediatorTest {
    public static void main(String[] args) {
        User user = new User("San");
        User user1 = new User("Lan");
        user.setMessage("Hi san");
        user1.setMessage("Hi lan");
    }
}
