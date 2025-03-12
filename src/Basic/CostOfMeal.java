package Basic;

public class CostOfMeal {

    public static void calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tax + tip;
        System.out.println("Your total meal price is " + result);


    }

    public static void main(String[] args) {
        calculateTotalMealPrice(37, .18, .08);

    }
}
