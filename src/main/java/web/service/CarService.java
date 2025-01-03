package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarService {
    private static List<Car> cars = new ArrayList<>();

    public CarService() {
        cars.add(new Car("Vaz", "Blue", 87));
        cars.add(new Car("Oka", "White", 52));
        cars.add(new Car("Uaz", "Grin", 90));
        cars.add(new Car("Volga", "Bleck", 105));
        cars.add(new Car("Niva", "Orange", 15));
    }

    public List<Car> getCars(int count) {
        if (count == 0 || count > 5) return cars;
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
