package com.company.devices;

public class LPG extends Car{
    @Override
    public void refuel() {
        System.out.println("Pouring gas.");
    }

    public LPG(String model, String producer, int year, String color) {
        super(model, producer, year, color);
    }

    @Override
    public void turnOn(){
        System.out.println("Car turns on gas");
    }
}
