package com.vishal.ioc.model;

public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
        System.out.println("Bean Created....");
    }

    public void init() {
        System.out.println("Initialization logic executed");
    }

    public void destroy() {
        System.out.println("Cleanup logic executed");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
