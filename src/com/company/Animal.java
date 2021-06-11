package com.company;

public class Animal {
    public String name;
    final String species;
    private double weight;

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

    public void feed() {
        if (weight > 0) {
            this.weight += 0.1;
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
}
