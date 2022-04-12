package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getListCars() {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("BMV", "petrol-electric", 2020));
        carList.add(new Car("Tesla", "electric", 2015));
        carList.add(new Car("Opel", "petrol", 1985));
        carList.add(new Car("Lada", "petrol", 2020));
        carList.add(new Car("Ford", "petrol-electric", 2010));

        return carList;
    }
}
