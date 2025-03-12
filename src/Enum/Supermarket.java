package Enum;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //🧾 Trin 2: Lad brugeren vælge en vare ved at skrive et tal.
        System.out.println("What will you like to know the price of?");
        System.out.println("1 - Eggs");
        System.out.println("2 - Milk");
        System.out.println("3 - Bread");
        System.out.println("4 - Apple");
        System.out.println("5 - Salad");
        System.out.println("6 - Shampoo");
        System.out.println("7 - Toothpaste");
        int input = scanner.nextInt();

        System.out.println();
        Groceries result;
        //💰 Trin 3: Programmet viser prisen på den valgte vare.

        switch (input) {
            case 1:
                result = Groceries.EGGS;
                System.out.println(result + " costs " + result.getPrice());
                break;
            case 2:
                result = Groceries.MILK;
                System.out.println(result + " costs " + result.getPrice());
                break;
            case 3:
                result = Groceries.BREAD;
                System.out.println(result + " costs " + result.getPrice());
                break;
            case 4:
                result = Groceries.APPLE;
                System.out.println(result + " costs " + result.getPrice());
                break;
            case 5:
                result = Groceries.SALAD;
                System.out.println(result + " costs " + result.getPrice());
                break;
            case 6:
                result = Groceries.SHAMPOO;
                System.out.println(result + " costs " + result.getPrice());
                break;
            case 7:
                result = Groceries.TOOTHPASTE;
                System.out.println(result + " costs " + result.getPrice());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
//🛒 Trin 1: Opret en enum med forskellige varer i et supermarked.
//🧾 Trin 2: Lad brugeren vælge en vare ved at skrive et tal.
//💰 Trin 3: Programmet viser prisen på den valgte vare.