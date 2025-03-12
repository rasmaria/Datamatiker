package Calculator;

import java.util.Scanner;
public class CalculatorAppFinal {


    // Static methods for performing operations
    public static int add(int number1, int number2) {
        return (number1 + number2);
    }

    public static int subtract(int number1, int number2) {
        return (number1 - number2);
    }

    public static int multiply(int number1, int number2) {
        return (number1 * number2);
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return number1 / number2;
    }

    // Main method to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Please write a number from 1-10:");
        int number1 = scanner.nextInt();
        System.out.println("Please write a new number from 1-10:");
        int number2 = scanner.nextInt();

        System.out.println("Please type in if you wish to +, -, *, or / and press ENTER");
        String math = scanner.next(); // Input for operation (+, -, *, /)

        double result = 0;

        // Perform the appropriate calculation based on user input
        switch (math) {
            case "+":
                result = add(number1, number2);
                break;
            case "-":
                result = subtract(number1, number2);
                break;
            case "*":
                result = multiply(number1, number2);
                break;
            case "/":
                result = divide(number1, number2);
                break;
            default:
                System.out.println("Invalid operation.");
                return; // Exit if operation is invalid
        }

        // Output the result
        System.out.println("If you " + math + " your first number (" + number1 + "), with your second number (" + number2 + "), you get: " + result);
    }
}
