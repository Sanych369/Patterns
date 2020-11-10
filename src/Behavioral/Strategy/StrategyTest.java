package Behavioral.Strategy;

/**
 * Стратегия (Strategy) - Определяет ряд алгоритмов позволяя взаимодействовать между ними.
 * Алгоритм стратегии может быть изменен во время выполнения программы.
 *
 * Пример в java - метод compare() java.util.Comparator,
 * выполненный среди других методов sort() у Collections.
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new DownloadWindowsStrategy());
        Context context1 = new Context(new DownloadLinuxStrategy());
        context.download("file.jsp");
        context1.download("file.html");
    }
}
