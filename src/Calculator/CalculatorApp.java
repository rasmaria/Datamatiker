package Calculator;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write a number from 1-10:");
        int number1 = scanner.nextInt();
        System.out.println("Please write a new number from 1-10:");
        int number2 = scanner.nextInt();
        System.out.println("Please type in if you wish to add or subtract or divide or multiply and press ENTER");
        int math = scanner.nextInt();
    }
}

/*
        double result = 0;
        switch (math) {
            case "+":
                result = Calculator.Calculator2.add(number1 + number2);
                break;
            case "-":
                result = Calculator.Calculator2.subtract(number1 - number2);
                break;
            case "*":
                result = Calculator.Calculator2.multiply(number1 * number2);
                break;
            case "/":
                result = Calculator.Calculator2.divide(number1 / number2);
                break;


        }
        System.out.println("If you " + math + " your first number;" + number1 + ", with your second number; " + number2 + ", you get = " + result);
    }
}

/*
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
        */


