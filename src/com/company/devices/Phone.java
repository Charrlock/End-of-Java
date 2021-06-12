package com.company.devices;

import com.company.Application;
import com.company.creatures.Human;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Phone extends Device {
    static final String DEFAULT_SERVER = "www.google-play.com";
    static final String DEFAULT_PROTOCOL = "HTTPS";
    static final String DEFAULT_VERSION = "4.7.1";
    public Human owner = null;
    public List<Application> apps_installed = new ArrayList<Application>();

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

    public void installAnApp(String name) {
        System.out.println("I need version and server address too!");
    }

    public void installAnApp(String name, String version) {
        System.out.println("I need a server address too!");
    }

    public void installAnApp(String name, String version, String server_address) {
        System.out.println("Installing an app of choice");
    }

    public void installAnApp(List<String> names) {
        System.out.println("Installing all apps of choice");
    }

    public void installAnApp(URL url) {
        System.out.println("Installing an app from a link");
    }

    public boolean isAlreadyInstalled(Application app) {
        return apps_installed.contains(app);
    }

    public boolean isAlreadyInstalled(String name) {
        for ( Application app : apps_installed) {
            if (app.name.equals(name)) {
                return true;
            }
        }
        return false;
    }

    public double valueOfApps() {
        double sum = 0.0;
        for (Application application : apps_installed) {
            sum += application.price;
        }
        return sum;
    }

    public void listFreeApps() {
        for (Application application : apps_installed) {
            if (application.price == 0.0) {
                System.out.println(application);
            }
        }
    }

    public void listApps() {
        List<Application> listed = apps_installed;
        Comparator<Application> Lambda = Comparator.comparing(app -> app.name);
        listed.sort(Lambda);
        System.out.println(listed);
    }

    public void listAppsByPrice() {
        List<Application> listed = apps_installed;
        Comparator<Application> Lambda = Comparator.comparing(app -> app.price);
        listed.sort(Lambda);
        System.out.println(listed);
    }

    public void installApp(Application app) {
        if (owner != null) {
            if (owner.cash > app.price) {
                if (!isAlreadyInstalled(app)) {
                    apps_installed.add(app);
                    owner.cash -= app.price;
                }
            }
        } else {
            System.out.println("Something went wrong");
        }
    }


}
