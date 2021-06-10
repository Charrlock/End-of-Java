package com.company.devices;

public class Phone {
    final String model;
    final String producer;
    final int year;

    public Phone(String model, String producer, int year) {
        this.model = model;
        this.producer = producer;
        this.year = year;
    }


    public String toString(){
        return model + " " + producer + " " + year;
    }
}
