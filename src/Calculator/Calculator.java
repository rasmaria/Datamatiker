package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a number from 1-10:");
        double number1 = scanner.nextInt();
        System.out.println("Please write a new number from 1-10:");
        double number2 = scanner.nextInt();
        System.out.println("If you add your first number; " + number1 + ", to your second number; " + number2 + ", you get = " + (number1 + number2));
        System.out.println("If you subtract your first number; " + number1 + ", with your second number; " + number2 + ", you get = " + (number1 - number2));
        System.out.println("If you multiply your first number; " + number1 + ", with your second number; " + number2 + ", you get = " + (number1 * number2));
        System.out.println("If you divide your first number; " + number1 + ", with your second number; " + number2 + ", you get = " + (number1 / number2));
        System.out.println("The difference of your first number; " + number1 + ", to your second number; " + number2 + ", is = " + (Math.abs(number1 - number2)));
        System.out.println("The product of your first number; " + number1 + ", to your second number; " + number2 + ", is = " + (number1 * number2));
        System.out.println("The average of your first number; " + number1 + ", to your second number; " + number2 + ", is = " + ((number1 + number2)/2));
        System.out.println(Math.abs(number1));
        System.out.println(Math.pow(number1, number2));
        System.out.println(Math.sqrt(number1));
        System.out.println(Math.max(number1, number2));
        System.out.println(Math.min(number1, number2));
    }
}
