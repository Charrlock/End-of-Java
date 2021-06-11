package com.company.devices;

import com.company.creatures.Human;

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

    @Override
    public void sell(Human seller, Human buyer, double price) {
        System.out.println("Phone sold");
    }
}
