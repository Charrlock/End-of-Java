package com.company.devices;

public class Car extends Device {

    public String color;
    public boolean isWorking = true;
    public double value = 10000.0;


    public Car(String model, String producer, int year, String color) {
        super(model, producer, year);
        this.color = color;
    }

    public String toString() {
        return producer + " " + model + " " + year + " year";
    }

    @Override
    public void turnOn() {
        System.out.println("The " + this.producer + " is turning on with a *Wrooom*");
    }

}
