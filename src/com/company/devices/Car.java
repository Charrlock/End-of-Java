package com.company.devices;

import com.company.creatures.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {

    public String color;
    public boolean isWorking = true;
    public double value = 10000.0;
    public List<Human> owners = new ArrayList<>();

    public abstract void refuel();

    public Car(String model, String producer, int year, String color) {
        super(model, producer, year);
        this.color = color;
    }

    public String toString() {
        return producer + " " + model + " " + year + " year";
    }

    public Boolean had_the_car(Human owner) {
        return owners.contains(owner);
    }

    public Boolean sold_the_car_to(Human seller, Human buyer) {
        for (int i = 0; i < (owners.size() - 1); i++){
            if((owners.get(i) == seller) && (owners.get(i+1) == buyer)){
                return true;
            }
        }
        return false;
    }

    public int car_transactions_list(){
        return (owners.size() -1) ;
    }

    @Override
    public void turnOn() {
        System.out.println("The " + this.producer + " is turning on with a *Wrooom*");
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        try {
            boolean seller_has_the_car = false;
            boolean buyer_has_free_spot = false;
            boolean buyer_has_enough_money = false;
            int i, j;

            if (buyer.cash > price) {
                buyer_has_enough_money = true;
                System.out.println("Buyer has enough money");
            }

            for (i = 0; i < seller.garage.length; i++) {
                if (seller.garage[i] == this) {
                    seller_has_the_car = true;
                    System.out.println("Seller has the car");
                    break;
                }
            }
            for (j = 0; j < buyer.garage.length; j++) {
                if (buyer.garage[i] == null) {
                    buyer_has_free_spot = true;
                    System.out.println("Buyer has a spot");
                    break;
                }
            }
            if (seller_has_the_car && buyer_has_free_spot && buyer_has_enough_money && (owners.get(owners.size() - 1)) == seller) {
                buyer.garage[j] = this;
                seller.setCar(null, i);
                buyer.cash -= price;
                seller.cash += price;
                owners.add(buyer);
                System.out.println(seller.firstName + " sold a " + this + " to " + buyer.firstName + " for a price of " + price + " new car is in buyers parking spot no " + j);

            }
            else
            {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

