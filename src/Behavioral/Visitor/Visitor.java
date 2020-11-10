package Behavioral.Visitor;

public interface Visitor {
    void visit(SportCar sportCar);
    void visit(Engine engine);
    void visit(Wheel whell);
}
