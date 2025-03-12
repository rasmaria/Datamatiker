package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Navne {

    public static void main(String[] args) {
        ArrayList<String> navne = new ArrayList<String>();
        navne.add("Maria");
        navne.add("Laura");
        navne.add("Julie");

        System.out.println(navne);

        System.out.println("Search name:");
        Scanner input = new Scanner(System.in);
        String searchName = input.nextLine();
        for (int i = 0; i < navne.size(); i++) {
            if (navne.get(i).equalsIgnoreCase(searchName)) {
                System.out.println(searchName + " is on the list at index " + i);
                break;
            } else {
                System.out.println(searchName + " is not on the list.");
                break;
            }
        }
        System.out.println("Add name:");
        String addName = input.nextLine();
        for (int i = 0; i < navne.size(); i++) {
            if (navne.get(i).equalsIgnoreCase(addName)) {
                System.out.println("Name is already on the list!");
                break;
            } else {
                navne.add(addName);
                System.out.println(addName + " was added to the list:");
                System.out.println(navne);
                break;
            }
        }
    }
}