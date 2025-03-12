package OOP.BIKES;

//5. Lav en Cykel superclass der også har en farve, et antal kørte kilometer, antal hjul og en nypris.
// Flyt disse funktionaliteter ud af din Ladcykel class og sørg for at Ladcykel nedarver dem fra klassen Cykel.

public class Cykel {
    private String color;
    private int wheels;
    private double newPrice;
    private double km;

    public Cykel(String color, int wheels, double newPrice, double km) {
        this.color = color;
        this.wheels = wheels;
        this.newPrice = newPrice;
        this.km = km;
    }
    public String getColor() {
    return color;
    }

    public int getWheels() {
        return wheels;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public double getKm() {
        return km;
    }
}

