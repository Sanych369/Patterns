package Behavioral.Visitor;

public class CarVisitor implements Visitor {
    @Override
    public void visit(SportCar sportCar) {
        print("car");
    }

    @Override
    public void visit(Engine engine) {
        print("engine");
    }

    @Override
    public void visit(Wheel wheel) {
        print("wheel");
    }

    void print(String str) {
        System.out.println(str);
    }
}
