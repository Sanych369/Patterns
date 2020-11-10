package Creational.Prototype;

public class Object implements Copy {
    private Type type;

    @Override
    public Object copy() {
        return new Object();
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
