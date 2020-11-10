package Structural.Flyweight;

public class FlyWeight {
    private int row;
    public FlyWeight(int row) {
        this.row = row;
        System.out.println("row: " + row);
    }
    void report(int col) {
        System.out.println(" " + row + col);
    }
}
