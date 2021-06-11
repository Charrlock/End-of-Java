package com.company.devices;

public class Electric extends Car{
    @Override
    public void refuel() {
        System.out.println("Not a refuel, but you gotta charge those batteries.");
    }

    public Electric(String model, String producer, int year, String color) {
        super(model, producer, year, color);
    }
    @Override
    public void turnOn(){
        System.out.println("Car turns on electricity *magic*");
    }
}
