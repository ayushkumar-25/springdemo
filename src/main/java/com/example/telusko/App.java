package com.example.telusko;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // Normal way of creating object
        Car car = new Car();
        Bike bike = new Bike();
        car.drive();
        bike.drive();

        // Using Interface and implement method
        Vehicle vehicle = new Car();
        vehicle.drive();

        // Using Spring Bean
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/telusko/config.xml");

        Vehicle obj = (Vehicle) context.getBean("vehicle");
        obj.drive();
    }
}
