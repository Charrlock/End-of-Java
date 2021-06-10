package com.company;

public class Car {
    final String model;
    final String producer;
    final int year;
    public String color;
    public boolean isWorking = true;
    public double value;


    public Car(String model, String producer, int year, String color) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return producer + " " + model + " " + year + " year";
    }
}
