package com.vishal.ioc.model;

public class Car {
    private String carName;
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", engine=" + engine +
                '}';
    }
}
