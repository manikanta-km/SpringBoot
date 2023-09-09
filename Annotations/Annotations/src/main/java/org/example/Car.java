package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    public String colour;
    public String model;
    public Car(){
        this.colour = "red";
        System.out.println("To check whether the annotation @Component, created an object or not bcz when an object is created it will invoke the constructor present in the class and this is the constructor of the car class ");
    }

    public Car(String colour) {
        System.out.println("Car's single parameterised constructor is called and colour is :" + colour);
        this.colour = colour;
    }

    public Car(String colour, String model) {
        this.colour = colour;
        this.model = model;
        System.out.println("TWO parameterised constructor is called with parameters colour and model :"+colour+" "+model);
    }


    public void setColour(String colour) {
        this.colour = colour;
    } // this is created for putmapping api

    // objects which are created and maintained by Springboot are known as Beans
}
