package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;
import com.company.devices.Electric;
import com.company.devices.LPG;

import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        Human Bro = new Human();
        Bro.firstName = "Bro";
        Bro.lastName = "Browski";
        Bro.pet = new Pet("mouse");
        Bro.pet.name = "Stewart";
        Bro.pet.feed();
        Bro.pet.takeForAWalk();
        Bro.pet.takeForAWalk();
        Bro.pet.takeForAWalk();

        Car car = new Diesel("328i", "BMW", 1999, "blue");

        System.out.println(car);


        Bro.setSalary(3000.0);
        Bro.setSalary(4500.0);
        System.out.println(Bro.getSalary());

        Bro.setCar(car);
        System.out.println(Bro.firstName + " has a car, and it is a freaking " + Bro.getCar());

        Car car2 = new Diesel("360 spyder", "Ferrari", 2005, "Red");
        Car car3 = new Diesel("360 spyder", "Ferrari", 2005, "Red");
        System.out.println(car2.equals(car3));
        System.out.println(Bro.pet);
        System.out.println(Bro);

        Phone nokia1 = new Phone("6310i", "Nokia", 2000);
        System.out.println(nokia1);
        Bro.setSalary(1000.0);
        Bro.setCar(car3);
        System.out.println(car3.value);

        nokia1.turnOn();
        car3.turnOn();

        Human MsBro = new Human();
        MsBro.firstName = "MsBro";
        MsBro.lastName = "Browska";
        Bro.cash = 300.0;
        MsBro.cash = 300.0;
        Bro.pet.sell(Bro, MsBro, 200.0); // Bro just sold a dead mouse to his wife
        MsBro.pet.takeForAWalk();

        //Bro.sell(Bro, MsBro, 200); threw exceptions, commented out
        FarmAnimal mouse1 = new FarmAnimal("mouse");
        FarmAnimal cat1 = new FarmAnimal("cat");
        cat1.name = "Fluffy";
        //cat1.feed();
        cat1.feed(1.0);
        mouse1.name = "CatFood";
        System.out.println(cat1);
        mouse1.beEaten();
        System.out.println(mouse1);
        Car diesel1 = new Diesel("test1", "test1", 2000, "blue");
        Car electric1 = new Electric("test2", "test2", 2000, "white");
        Car lpg1 = new LPG("test3", "test3", 2000, "black");

        diesel1.turnOn();
        diesel1.refuel();
        electric1.turnOn();
        electric1.refuel();
        lpg1.turnOn();
        lpg1.refuel();

        nokia1.installAanApp("http://www.example.com/docs/resource1.html");
        nokia1.installAanApp("egg", "egg");
        nokia1.installAanApp("egg", "egg", "egg");
        URL url = new URL(" http://www.example.com/docs/resource1.html");
        nokia1.installAanApp(url);




    }
}
