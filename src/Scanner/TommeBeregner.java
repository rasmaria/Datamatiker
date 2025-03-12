package Scanner;

import java.util.Scanner;

public class TommeBeregner {
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("To help you convert inches to centimeters, please write how many inches you have measured: ");
        Scanner inputInches = new Scanner(System.in);
        double inchesMeasured = inputInches.nextDouble();
        final double CM_INCH = 2.54;
        double cm = inchesMeasured * CM_INCH;
        System.out.println("Thank you!");
        System.out.println(inchesMeasured + " inches is the same as " + cm + " cm.");
    }
}

