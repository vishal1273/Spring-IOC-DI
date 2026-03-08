package com.vishal.ioc.model;

public class Engine {
    private String modelYear;

    public Engine(String modelYear) {
        this.modelYear = modelYear;
    }

    public Engine() {
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelYear='" + modelYear + '\'' +
                '}';
    }
}
