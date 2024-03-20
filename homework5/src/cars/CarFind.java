package cars;

import java.time.LocalDate;
import java.util.ArrayList;

public class CarFind {

    public static ArrayList<Car> findCarsBrand(ArrayList<Car> cars, String brand) {
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }


    public static ArrayList<Car> findCarsModelAndExploitation(ArrayList<Car> cars, String model, int exploitation) {
        ArrayList<Car> filteredCars = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();;


        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (currentDate.getYear() - car.getRegisterYear() > exploitation)) {

                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static ArrayList<Car> findCarsRegisterYearAndPrice(ArrayList<Car> cars, int registerYear, double price) {
        ArrayList<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getRegisterYear() == registerYear && car.getPrice() > price) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
