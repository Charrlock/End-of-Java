package com.company;

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

    }
}
