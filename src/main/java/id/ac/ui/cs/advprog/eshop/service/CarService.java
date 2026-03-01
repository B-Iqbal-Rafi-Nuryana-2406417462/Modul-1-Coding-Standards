package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Car;
import java.util.List;

public interface CarService extends BaseService<Car>{
    Car create(Car car);
    List<Car> findAll();
    Car findById(String carId);
    Car update(String carId, Car updatedCar);
    void deleteById(String carId);
}
