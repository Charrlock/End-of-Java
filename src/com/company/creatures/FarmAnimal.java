package com.company.creatures;

import com.company.edible;

public class FarmAnimal extends Animal implements edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
         this.weight= 0.0;
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
}
