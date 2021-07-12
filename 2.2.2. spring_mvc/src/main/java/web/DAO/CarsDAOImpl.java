package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsDAOImpl implements CarsDAO {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CARS_COUNT, "Audi", 3));
        cars.add(new Car(++CARS_COUNT, "BMW", 5));
        cars.add(new Car(++CARS_COUNT, "Lada", 12));
        cars.add(new Car(++CARS_COUNT, "MB", 5));
        cars.add(new Car(++CARS_COUNT, "Lexus", 6));
    }
    @Override
    public List<Car> getCars(int number) {
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}
