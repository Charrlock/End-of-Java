package com.company;

import com.company.devices.Car;

import java.util.Comparator;

public class SortByYear implements Comparator<Car> {
        public int compare(Car a, Car b)
        {
        return a.year - b.year;
        }
}
