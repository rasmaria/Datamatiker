package ArrayList.CarsGarage;
import java.util.ArrayList;

public class Garage {

    private ArrayList<Bil> cars;

    public Garage() {
        cars = new ArrayList<Bil>();
    }

    public void addCar(Bil car) {
        cars.add(car);

    }

    public Double sumOfCarsPrice() {
        double carsPrice = 0.0;
        for (Bil car : cars) {
            carsPrice += car.getPrice();
        }
        return carsPrice;
    }

    @Override
    public String toString() {
        String overviewCars = "Cars in the garage: \n";

        for (Bil bil : cars) {
            overviewCars += bil + "\n";
        }
        return overviewCars;
    }
}