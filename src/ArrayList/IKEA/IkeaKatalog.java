package ArrayList.IKEA;

import java.util.ArrayList;
import java.util.Scanner;

public class IkeaKatalog {
    private ArrayList<String> catalog;
    private static Scanner input = new Scanner(System.in);

    public IkeaKatalog() {
        catalog = new ArrayList<>();
        catalog.add("BILLY bogreol");
        catalog.add("MALM seng");
        catalog.add("MALM kommode");
        catalog.add("LACK sofabord");
    }

    public void addFurniture() {
        System.out.println("Type in a furniture you wish to add:");
        String addFurniture = input.nextLine();
        catalog.add(addFurniture);
    }

    public void removeFurniture() {
        System.out.println("Type in a furniture you wish to remove:");
        String removeFurniture = input.nextLine();
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).equalsIgnoreCase(removeFurniture)) {
                catalog.remove(i);
                System.out.println(removeFurniture + " has been removed from the list");
                break;
            } else {
                System.out.println("Couldn't find " + removeFurniture + " on the list.");
                break;
            }
        }
    }

    public void showList() {
        for (String furniture : catalog) {
            System.out.println(catalog);
            break;
        }
    }

    public void searchFurniture() {
        System.out.println("Search for furniture on the list:");
        String search = input.nextLine();
        for (int i = 0; i < catalog.size(); i++) {
            if (catalog.get(i).equalsIgnoreCase(search)) {
                System.out.println(search + " is on the list at index " + i);
                break;
            } else {
                System.out.println(search + " is not on the list.");
                break;
            }
        }
    }
}
