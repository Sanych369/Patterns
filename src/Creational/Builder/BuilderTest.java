package Creational.Builder;

/**
 * Строитель (Builder) - Класс, который представляет собой интерфейс для создания сложного объекта.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Build build = new Build(1);
        build.carBuild();
        Build build1 = new Build(2);
        build1.carBuild();
    }
}
