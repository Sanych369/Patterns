package Behavioral.State;

/**
 * Состояние (State) - Используется в тех случаях,
 * когда во время выполнения программы объект должен менять свое поведение
 * в зависимости от своего состояния.
 *
 * Пример в java - метод execute() у javax.faces.lifecycle.LifeCycle
 * (контролируется FacesServlet, поведение зависит от текущей фазы (состояния) жизненного цикла JSF).
 */
public class StateTest {
    public static void main(String[] args) {
        PlayContext playContext = new PlayContext();
        State stop = new StopPlay();
        State start = new StartPlay();
        playContext.setState(start);
        playContext.doAction();
        playContext.setState(stop);
        playContext.doAction();
    }
}
