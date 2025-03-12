package ArrayList.IKEA;

import ArrayList.Spotify.Song;

import java.util.Scanner;

public class IkeaMain {

    static Scanner scanner = new Scanner(System.in);
    static IkeaKatalog katalog = new IkeaKatalog();

    public static void main(String[] args) {

        System.out.println("Welcome to IKEA! Choose an option: ");
        while (true) {
            showMenu();
            outputUserChoice();
        }
    }

    public static void showMenu() {
        System.out.println("1 - Show catalog ");
        System.out.println("2 - Add furniture");
        System.out.println("3 - Remove furniture");
        System.out.println("4 - Search for furniture");
        System.out.println("5 - Exit the program");
    }

    public static void outputUserChoice() {
        int input = scanner.nextInt();
        scanner.nextLine();
        switch (input) {
            case 1:
                System.out.println("CATALOG:");
                katalog.showList();
                break;
            case 2:
                katalog.addFurniture();
                break;
            case 3:
                katalog.removeFurniture();
                break;
            case 4:
                katalog.searchFurniture();
                break;
            case 5:
                System.out.println("Goodbye!");
                scanner.close();
                return;
            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
}
