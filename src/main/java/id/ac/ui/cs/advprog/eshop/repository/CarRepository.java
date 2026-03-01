package id.ac.ui.cs.advprog.eshop.repository;

import id.ac.ui.cs.advprog.eshop.model.Car;
import id.ac.ui.cs.advprog.eshop.util.IdGenerator;
import org.springframework.stereotype.Repository;



@Repository
public class CarRepository extends AbstractInMemoryRepository<Car>{

    @Override
    protected String getId(Car car) {
        return car.getCarId();
    }

    @Override
    protected void setId(Car car, String id) {
        car.setCarId(id);
    }

    @Override
    protected void copyField(Car existingCar, Car updatedCar) {
        existingCar.setCarName(updatedCar.getCarName());
        existingCar.setCarColor(updatedCar.getCarColor());
        existingCar.setCarQuantity(updatedCar.getCarQuantity());
    }

}
