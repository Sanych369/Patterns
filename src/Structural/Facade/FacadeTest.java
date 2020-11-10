package Structural.Facade;

/**
 * Фасад (Facade) - Объект, который абстрагирует работу с несколькими классами,
 * объединяя их в единое целое.
 * <p>
 * Пример в java - javax.faces.context.ExternalContext,
 * который используется внутри ServletContext, HttpSession,
 * HttpServletRequest, HttpServletResponseи т.д.
 */
public class FacadeTest {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        System.out.println();
        facade.stopCar();
    }
}
