package Enum;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class CalenderMonths {
    public static void main(String[] args) {
        int input;
        Months month = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a month from 1-12 and press ENTER:");
        System.out.println("1 - January");
        System.out.println("2 - February");
        System.out.println("3 - March");
        System.out.println("4 - April");
        System.out.println("5 - May");
        System.out.println("6 - June");
        System.out.println("7 - July");
        System.out.println("8 - August");
        System.out.println("9 - September");
        System.out.println("10 - October");
        System.out.println("11 - November");
        System.out.println("12 - December");

        input = scanner.nextInt();
        if (input < 1 || input > 12) {
            System.out.println("Invalidf input!");
            return;
        }

        switch (input) {
            case 1:
                month = Months.JANUARY;
                break;
            case 2:
                month = Months.FEBRUARY;
                break;
            case 3:
                month = Months.MARCH;
                break;
            case 4:
                month = Months.APRIL;
                break;
            case 5:
                month = Months.MAY;
                break;
            case 6:
                month = Months.JUNE;
                break;
            case 7:
                month = Months.JULY;
                break;
            case 8:
                month = Months.AUGUST;
                break;
            case 9:
                month = Months.SEPTMEBER;
                break;
            case 10:
                month = Months.OCTOBER;
                break;
            case 11:
                month = Months.NOVEMBER;
                break;
            case 12:
                month = Months.DECEMBER;
                break;
        }
        System.out.print("You chose " + month + ". ");

        String result = switch (month) {
            case MARCH, APRIL, MAY -> "It's spring!";
            case JUNE, JULY, AUGUST -> "It's summer!";
            case SEPTMEBER, OCTOBER, NOVEMBER -> "It's autumn!";
            case DECEMBER, JANUARY, FEBRUARY -> "It's winter!";
        };
        System.out.println(result);

    }
}
