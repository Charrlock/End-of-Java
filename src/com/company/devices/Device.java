package com.company.devices;

import com.company.salleable;

public abstract class Device implements salleable {
    final String model;
    final String producer;
    public final int year;
    public double value;

    public Device(String model, String producer, int year) {
        this.model = model;
        this.producer = producer;
        this.year = year;
    }

    public String toString() {
        return model + " " + producer + " " + year;
    }

    abstract void turnOn();

}
