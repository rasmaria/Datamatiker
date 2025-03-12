package Basic;

public class CostOfMealForFivePeople {

    public static double calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tax + tip;
        return result;


    }

    public static void main(String[] args) {
        double groupTotalMealPrice = calculateTotalMealPrice(100, .20, .08);
        System.out.println("Total price for the meal incl. tips and tax: " + groupTotalMealPrice);
        double individualTotalMealPrice = groupTotalMealPrice / 5;
        System.out.println("Total price for the meal incl. tips and tax pr. person : " +individualTotalMealPrice);


    }
}
