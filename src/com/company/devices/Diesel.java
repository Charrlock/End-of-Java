package com.company.devices;

public class Diesel extends Car{
    @Override
    public void refuel() {
        System.out.println("Pouring gasoline.");
    }

    public Diesel(String model, String producer, int year, String color) {
        super(model, producer, year, color);
    }
    @Override
    public void turnOn(){
        System.out.println("Car turns on diesel");
    }
}
