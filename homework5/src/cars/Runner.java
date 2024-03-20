package cars;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "Hyundai", "i30", 2014, "Gray", 40000.0, "AA7744OK"));
        cars.add(new Car(2, "Honda", "CR-V", 2020, "Red", 70000.0, "AA7773OK"));
        cars.add(new Car(3, "Hyundai", "Tucson", 2022, "Black", 50000.0, "AA7777OK"));
        cars.add(new Car(4, "Hyundai", "Tucson", 2021, "Gray", 40000.0, "AA7777OK"));
        cars.add(new Car(5, "Hyundai", "Tucson", 2018, "White", 30000.0, "AA7777OK"));
        cars.add(new Car(6, "Hyundai", "Tucson", 2021, "Blue", 40000.0, "AA7777OK"));
        cars.add(new Car(7, "Hyundai", "Tucson", 2023, "Gray", 60000.0, "AA7777OK"));


        System.out.println(CarFind.findCarsBrand(cars, "honda"));
        System.out.println(CarFind.findCarsModelAndExploitation(cars,"Tucson", 3));
        System.out.println(CarFind.findCarsRegisterYearAndPrice(cars,2021, 30000));
    }
}