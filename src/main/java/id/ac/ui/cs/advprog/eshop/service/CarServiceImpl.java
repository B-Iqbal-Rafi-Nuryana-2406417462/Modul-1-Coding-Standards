package id.ac.ui.cs.advprog.eshop.service;

import id.ac.ui.cs.advprog.eshop.model.Car;

import id.ac.ui.cs.advprog.eshop.repository.BaseRepository;
import id.ac.ui.cs.advprog.eshop.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl extends AbstractBaseServiceImpl<Car> implements CarService{

    @Autowired
    private CarRepository carRepository;

    @Override
    protected BaseRepository<Car> getRepository(){
        return carRepository;
    }
}
