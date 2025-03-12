package SmartMetode;

import java.util.Scanner;

public class SmartMetode {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int sum = 0;

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("Input a number: ");
        sum = sum + Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + sum);


// ELLER SÅDAN HER!!!

    int sumSmart = 0;
    int numbersRead = 0;

    while (true) {
        if (numbersRead == 5){
            break;
        }
        System.out.println("Input number:");
        sumSmart = sumSmart + Integer.valueOf(scanner.nextInt());
        numbersRead = numbersRead + 1;

        }
    System.out.println("The sum of the number is " + sumSmart);
    }
    }
