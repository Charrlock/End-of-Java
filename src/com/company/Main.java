package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) throws Exception {
        Human Bro = new Human();
        Bro.firstName = "Bro";
        Bro.lastName = "Browski";
        Bro.pet = new Animal("mouse");
        Bro.pet.name = "Stewart";
        Bro.pet.feed();
        Bro.pet.takeForAWalk();
        Bro.pet.takeForAWalk();
        Bro.pet.takeForAWalk();

        Car car = new Car("328i", "BMW", 1999, "blue");

        System.out.println(car);


        Bro.setSalary(3000.0);
        Bro.setSalary(4500.0);
        System.out.println(Bro.getSalary());

        Bro.setCar(car);
        System.out.println(Bro.firstName + " has a car, and it is a freaking " + Bro.getCar());

        Car car2 = new Car("360 spyder", "Ferrari", 2005, "Red");
        Car car3 = new Car("360 spyder", "Ferrari", 2005, "Red");
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

        Bro.sell(Bro, MsBro, 200);

    }
}
