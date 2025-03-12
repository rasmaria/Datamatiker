package ArrayList.CarsGarage;

public class Bil {
    private String brand;
    private Double price;

    public Bil(String brand, Double price){
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return this.brand + " - price is: " + this.price + " DKK";
    }

}
