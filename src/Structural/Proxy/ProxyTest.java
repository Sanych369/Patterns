package Structural.Proxy;

/**
 * Заместитель (Proxy) - Объект, который является посредником между двумя другими объектами,
 * и который реализует/ограничивает доступ к объекту, к которому обращаются через него.
 *
 * Пример в java - javax.persistence.PersistenceContext.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");
        image.display();
        image.display();
    }
}
