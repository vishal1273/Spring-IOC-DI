package com.vishal.ioc.model;

public class Engine {
    private String modelYear;

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "modelYear='" + modelYear + '\'' +
                '}';
    }
}
