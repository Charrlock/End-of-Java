package com.company.devices;

public class Phone extends Device {

    public Phone(String model, String producer, int year) {
        super(model, producer, year);
    }


    public String toString() {
        return model + " " + producer + " " + year;
    }

    @Override
    public void turnOn() {
        System.out.println("The " + this.producer + " is turning on");
    }
}
