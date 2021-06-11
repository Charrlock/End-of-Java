package com.company.devices;

public abstract class Device {
    final String model;
    final String producer;
    final int year;

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
