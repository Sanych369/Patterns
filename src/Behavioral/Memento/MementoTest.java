package Behavioral.Memento;

/**
 * Хранитель (Memento) - Позволяет не нарушая инкапсуляцию зафиксировать и сохранить
 * внутренние состояния объекта так, чтобы позднее восстановить его в этих состояниях.
 * Пример в java - все реализации java.io.Serializable.
 */
public class MementoTest {
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user = new User("San", 32);
        User user1 = new User("Lan", 29);
        saveUser.add(user.save());
        user.restore(saveUser.get(0));
        saveUser.add(user1.save());
//        user1.restore(saveUser.get(1));
    }
}
