package com.company.devices;

import com.company.creatures.Human;

import java.net.URL;
import java.util.List;

public class Phone extends Device {
    static final String DEFAULT_SERVER = "www.google-play.com";
    static final String DEFAULT_PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "4.7.1";

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

    public void installAanApp(String name) {
        System.out.println("I need version and server address too!");
    }

    public void installAanApp(String name, String version) {
        System.out.println("I need a server address too!");
    }

    public void installAanApp(String name, String version, String server_address) {
        System.out.println("Installing an app of choice");
    }

    public void installAanApp(List<String> names) {
        System.out.println("Installing all apps of choice");
    }

    public void installAanApp(URL url) {
        System.out.println("Installing an app from a link");
    }
}
