package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(Bro.firstName+ " has a car, and it is a freaking " +Bro.getCar());

        Car car2 = new Car("360 spyder", "Ferrari", 2005, "Red");
        Car car3 = new Car("360 spyder", "Ferrari", 2005, "Red");
        System.out.println(car2.equals(car3));
        System.out.println(Bro.pet);
        System.out.println(Bro);

        Phone nokia = new Phone("6310i", "Nokia", 2000);
        System.out.println(nokia);

    }
}
