package com.company.creatures;

import com.company.feedable;
import com.company.salleable;

public abstract class Animal implements salleable, feedable {
    public String name;
    final String species;
    double weight;

    public static final double DEFAULT_DOG_WEIGHT = 10.0;
    public static final double DEFAULT_MOUSE_WEIGHT = 0.1;
    public static final double DEFAULT_CAT_WEIGHT = 5.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "mouse" -> this.weight = DEFAULT_MOUSE_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
        }
    }
    @Override
    public void feed() {
        if (weight > 0) {
            this.weight += 0.1;
            System.out.println("Your pet " + name + " weights now " + weight + "kg");
        } else {
            System.out.println("He is already dead");
        }
    }

    @Override
    public void feed(double foodWeight) {
        if (weight > 0) {
            this.weight += foodWeight;
            System.out.println("Your pet " + name + " weights now " + weight + "kg");
        } else {
            System.out.println("He is already dead");
        }
    }

    public void takeForAWalk() {
        if (weight > 0) {
            this.weight -= 0.1;
            System.out.println("Your pet " + name + " did some running and weights now " + weight + "kg");

        } else {
            System.out.println("He is already dead");
        }
    }

    public String toString() {
        return name + " is a " + species + " and weights " + weight + " kg";
    }

    @Override
    public void sell(Human seller, Human buyer, double price) throws Exception {
        if (this instanceof Human)
            throw new Exception("It is not possible to sell people anymore.");
        else if ((buyer.cash > price) && (seller.pet != null)) {
            buyer.cash -= price;
            seller.cash += price;
            System.out.println("You sold your pet " + seller.pet.name + " for " + price + " to " + buyer);
            buyer.pet = seller.pet;
            seller.pet = null;
        } else {
            System.out.println("You can't afford that buy right now.");
        }

    }
}
