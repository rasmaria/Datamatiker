package OOP.BIKES;

public class UniBike extends Cykel {

    public UniBike(String color, int wheels, double newPrice, double km) {
        super(color, 8, newPrice, km);
    }
    @Override
    public int getWheels() {
        return 1;
    }
    @Override
    public String toString() {
        return "Unicycle has " + getWheels() + " wheels and the color is " + super.getColor() + "." + "\nIt can drive up to " + super.getKm() + "/h and if you wat to buy it yourself the price is: " + super.getNewPrice() + ".";

    }

}
