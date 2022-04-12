package web.service;

import org.springframework.stereotype.Service;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    @Override
    public List<Car> getListCars(int count) {

        return Car.carListDefault(count);
    }
}
