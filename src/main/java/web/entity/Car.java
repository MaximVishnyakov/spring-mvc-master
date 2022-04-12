package web.entity;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Car {

    private String model;
    private String type;
    private int year;

    public Car() {
    }

    public Car(String model, String type, int year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static List<Car> carListDefault(int count) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMV", "petrol-electric", 2020));
        carList.add(new Car("Tesla", "electric", 2015));
        carList.add(new Car("Opel", "petrol", 1985));
        carList.add(new Car("Lada", "petrol", 2020));
        carList.add(new Car("Ford", "petrol-electric", 2010));


        return carList.stream().limit(count).collect(Collectors.toList());


    }

}

