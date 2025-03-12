package Enum;

public enum Groceries {
    //🛒 Trin 1: Opret en enum med forskellige varer i et supermarked.
    EGGS(7.8),
    MILK(2.1),
    BREAD(1.5),
    APPLE(0.5),
    SALAD(2.75),
    SHAMPOO(4.15),
    TOOTHPASTE(3.25);

    private double price;

    Groceries(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
