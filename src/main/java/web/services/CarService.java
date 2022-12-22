package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarsDao;
import web.models.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    final CarsDao carsDao;

    @Autowired
    public CarService(CarsDao carsDao) {
        this.carsDao = carsDao;
    }

    public List<Car> getCars(int count) {
        if (count < 5) {
            return carsDao.getCars().stream()
                    .limit(count)
                    .collect(Collectors.toList());
        } else {
            return carsDao.getCars();
        }
    }
}
