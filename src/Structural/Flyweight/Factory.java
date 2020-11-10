package Structural.Flyweight;

public class Factory {
    private FlyWeight[] pool;
    public Factory(int maxRows) {
        pool = new FlyWeight[maxRows];
    }
    public FlyWeight getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new FlyWeight(row);
        }
        return pool[row];
    }
}
