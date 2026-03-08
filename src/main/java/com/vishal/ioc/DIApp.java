package com.vishal.ioc;


import com.vishal.ioc.model.Car;
import com.vishal.ioc.model.Driver;
import com.vishal.ioc.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIApp {
    public static void main(String[] args) {
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        final Employee emp = (Employee) context.getBean("emp");
        System.out.println(emp);
        context.close();
    }
}
