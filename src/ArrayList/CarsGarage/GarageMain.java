package ArrayList.CarsGarage;

public class GarageMain {
    public static void main(String[] args) {

        //Opret garage
        Garage garage = new Garage();

        //Opret biler
        Bil first = new Bil("Volvo", 340000.0);
        Bil second = new Bil("Mercedes", 456789.50);
        Bil third = new Bil("VW", 241799.99);

        garage.addCar(first);
        garage.addCar(second);
        garage.addCar(third);

        System.out.println(garage);
        System.out.println("Total price sum of the cars: " + garage.sumOfCarsPrice() + " DKK");
    }

}
