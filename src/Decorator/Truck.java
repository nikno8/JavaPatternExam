package Decorator;

public class Truck implements Car {
    private Car car;

    public Truck(Car car) {
        this.car = car;
    }

    @Override
    public int getSpeed() {
        return car.getSpeed();
    }

    @Override
    public int getBaggageWeight() {
        return car.getBaggageWeight() + 100;
    }
}
