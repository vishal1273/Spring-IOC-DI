package com.vishal.ioc;


import com.vishal.ioc.model.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        final Driver driver = (Driver) context.getBean("driver");
        driver.displayProperties();

    }
}
