package com.company;

public class Application {
    public String name;
    public String version;
    public Double price;

    public Application() {
        name = "nothing";
        version = "first";
        price = 0.0;
    }

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
    public String toString() {
        return "app is " + name + " and the version is " + version + " and the price is: " + price;
    }
}
