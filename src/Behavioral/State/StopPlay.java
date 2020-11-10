package Behavioral.State;

public class StopPlay implements State {
    @Override
    public void doAction() {
        System.out.println("stop play");
    }
}
