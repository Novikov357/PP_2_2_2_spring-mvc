package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static final CarServiceImpl CAR_SERVICE = getCarService();
    private static final List<Car> CARS = new ArrayList<>();

    private CarServiceImpl() {
    }

    public static CarServiceImpl getCarService () {
        if (CAR_SERVICE == null) {
            return new CarServiceImpl();
        }
        return CAR_SERVICE;
    }

    static {
        CARS.add(new Car("Volvo", 2000, 2000));
        CARS.add(new Car("Mercedes", 2001, 2100));
        CARS.add(new Car("Porsche", 2002, 2200));
        CARS.add(new Car("Toyota", 2003, 2300));
        CARS.add(new Car("Ford", 2004, 2400));
    }


    public List<Car> getCars(int num) {
        if (num > 0) return switch (num) {
            case 1 -> CARS.subList(0, 1);
            case 2 -> CARS.subList(0, 2);
            case 3 -> CARS.subList(0, 3);
            case 4 -> CARS.subList(0, 4);
            default -> CARS;
        }; else {
            return new ArrayList<>();
        }
    }
}
