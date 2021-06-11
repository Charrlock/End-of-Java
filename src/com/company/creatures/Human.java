package com.company.creatures;

import com.company.devices.Car;

public class Human extends Animal {
    public Animal pet;
    public String firstName;
    public String lastName;
    private double salary;
    private String salarySettingDate = "Never";
    private Car car;
    public double cash;
    public final static Double DEFAULT_HUMAN_WEIGHT = 3.0; //when you are born

    public Human() {
        super("Homo Sapiens");
        weight = DEFAULT_HUMAN_WEIGHT;
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

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (salary > car.value) {
            System.out.println("Car bought outright (for money).");
            this.car = car;
        } else if (salary > car.value / 12) {
            System.out.println("Car bought by a loan.");
            this.car = car;
        } else {
            System.out.println("You can not afford a car right now, get an education, a job or ask for a raise.");
        }
    }

    public String toString() {
        return firstName + " " + lastName; // removed because not everybody has a pet
    }

}
