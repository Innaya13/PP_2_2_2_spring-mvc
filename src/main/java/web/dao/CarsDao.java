package web.dao;

import lombok.Data;
import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.Arrays;
import java.util.List;

@Data
@Component
public class CarsDao {
    private List<Car> cars = Arrays.asList(new Car("Tank", "negro", 1945),
            new Car("BTR", "blanco", 1978), new Car("TRACTOR", "green", 1918),
            new Car("BATMOBILE", "pink", 2056),new Car("Audi", "white", 2001));

    public void addCar(Car car) {
        cars.add(car);
    }
}
