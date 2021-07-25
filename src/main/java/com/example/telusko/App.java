package com.example.telusko;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // Normal way of creating object
        Car car = new Car();
        Bike bike = new Bike();
//        car.drive();
//        bike.drive();

        // Using Interface and implement method
        Vehicle vehicle = new Car();
//        vehicle.drive();

        // Using Spring Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/telusko/config.xml");

//        Vehicle obj1 = (Vehicle) context.getBean("vehicle1");
//        Vehicle obj2 = (Vehicle) context.getBean("vehicle2");
//        obj1.drive();
//        obj2.drive();

        // Using Annotation Based Configuration
//        Vehicle obj3 = (Vehicle) context.getBean("car");
//        obj3.drive();

        Tyre t = (Tyre) context.getBean("tyre");
        System.out.println(t);

//        Gate g = (Gate) context.getBean("gat");
//        System.out.println(g);
    }
}