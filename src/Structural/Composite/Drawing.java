package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Car {
    private List<Car> carList = new ArrayList<>();

    @Override
    public void draw(String color) {
        for (Car car : carList) {
            car.draw(color);
        }
    }
    public void add(Car car) {
        this.carList.add(car);
    }
    public void clear() {
        System.out.println();
        this.carList.clear();
    }
}
