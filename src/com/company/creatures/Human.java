package com.company.creatures;

import com.company.SortByYear;
import com.company.devices.Car;

import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal {
    public Animal pet;
    public String firstName;
    public String lastName;
    private double salary;
    private String salarySettingDate = "Never";
    public Car[] garage;
    public double cash;
    public final static double DEFAULT_HUMAN_WEIGHT = 3.0; //when you are born
    public final static int DEFAULT_GARAGE = 2;

    public Human() {
        super("Homo Sapiens");
        weight = DEFAULT_HUMAN_WEIGHT;
        this.garage = new Car[DEFAULT_GARAGE];
    }

    public Human(int garage) {
        super("Homo Sapiens");
        weight = DEFAULT_HUMAN_WEIGHT;
        this.garage = new Car[garage];
    }

    public double garageValue() {
        double sum = 0;
        for (Car car : garage) {
            if (car != null) {
                sum += car.value;

            }
        }
        return sum;
    }

    public void sort_Garage() {
        Arrays.sort(garage, new SortByYear());
    }

    public String getSalarySettingDate() {
        return salarySettingDate;
    }

    public void setSalarySettingDate() {
        this.salarySettingDate = "Just now";
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Your income cannot be making you poorer man");
        } else {
            System.out.println("Previous salary was: " + this.salary);
            System.out.println("Last changes made: " + getSalarySettingDate());
            setSalarySettingDate();
            System.out.println("Data sent to the accountants");
            System.out.println("Remember to send documentation to Ms. Hania");
            System.out.println("ZUS and US know everything");
            System.out.println("Your new salary is: " + salary);
            this.salary = salary;
        }
    }

    public Car getCar(int spot) {
        return garage[spot];
    }

    public void setCar(Car car, int spot) {
        if (car == null) {
            garage[spot] = null;
            System.out.println("Car removed from spot no " + spot);
        }
        else if (salary > car.value) {
            System.out.println("Car bought outright (for money).");
            garage[spot] = car;
            car.owners.add(this);
        } else if (salary > car.value / 12) {
            System.out.println("Car bought by a loan.");
            garage[spot] = car;
            car.owners.add(this);
        } else {
            System.out.println("You can not afford a car right now, get an education, a job or ask for a raise.");
        }
    }

    public String toString() {
        return firstName + " " + lastName; // removed because not everybody has a pet
    }

    @Override
    public void feed(double foodWeight) {
        this.weight += foodWeight;
    }
}
