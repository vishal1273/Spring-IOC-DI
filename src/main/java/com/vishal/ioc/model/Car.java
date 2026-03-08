package com.vishal.ioc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    private String carName;

    @Autowired
    @Qualifier("engine2")
    private Engine engine;

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", engine=" + engine +
                '}';
    }
}
