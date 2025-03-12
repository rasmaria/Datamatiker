package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class dyrListe {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<String>();
        animal.add("Dog");
        animal.add("Goat");
        animal.add("Elephant");
        //Print liste
        System.out.println(animal);
        //Print størrelse på liste
        System.out.println(animal.size());

        //Tilføj ekstra dyr

        animal.add("Monkey");
        animal.add("Snake");
        System.out.println(animal);
        System.out.println(animal.size());

        //Remove på index 4 (SNake)
        animal.remove(4);
        System.out.println(animal);
        System.out.println(animal.size());

        //Sorter alfabetisk
        System.out.println("Sorted alphabetically after Collections");
        Collections.sort(animal);
        for (String i : animal) {
            System.out.println(i);
        }



        //🐶 Spørg brugeren om at indtaste et dyr og tilføj det til listen.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert favorite animal:");
        String input = scanner.nextLine();
        animal.add(input);

        //Anden måde at sortere på:
        System.out.println("Sorted alphabetically after sort and Null");
        animal.sort(null);
        System.out.println(animal);
        System.out.println(animal.size());

        animal.add("Gorilla");

        //Tredje måde at sortere på:
        animal.sort(String::compareToIgnoreCase);
        System.out.println(animal);
        System.out.println(animal.size());



    }
}
