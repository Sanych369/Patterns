package Behavioral.Visitor;

public class Engine implements Car {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
