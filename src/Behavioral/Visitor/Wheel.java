package Behavioral.Visitor;

public class Wheel implements Car {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
