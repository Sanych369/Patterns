package Behavioral.State;

public class StartPlay implements State {
    @Override
    public void doAction() {
        System.out.println("start play");
    }
}
