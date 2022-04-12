package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.entity.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getListCars(int count) {

        return carDao.getListCars(count);
    }
}
