package Basic;

import java.util.Scanner;

public class TemperaturOmregner {
    public static double fahrToCels(double fahr) {
        return (fahr - 32) * 5 / 9;
    }

    public static double celsToFahr(double cels) {
        return (cels * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        System.out.println("What is the temperature in fahrenheit?:");
        Scanner inputFahr = new Scanner(System.in);
        double fahrenheit = inputFahr.nextDouble();
        double fahrentheitToCelsius = fahrToCels(fahrenheit);
        System.out.println(fahrenheit + " fahrenheit is in celsius: " + fahrentheitToCelsius);

        System.out.println("\nWhat is the temperature in celsius?:");
        Scanner inputCels = new Scanner(System.in);
        double celsius = inputCels.nextDouble();
        double celsiusToFahrenheit = celsToFahr(celsius);
        System.out.println(celsius+ " celsius is in fahrenheit: " + celsiusToFahrenheit);



    }
}
