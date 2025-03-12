package OOP;
import java.util.Scanner;

public class PersonklasseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your first name:");
        String firstName = scanner.nextLine();
        System.out.println("Write your middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Write your last name:");
        String lastName = scanner.nextLine();
        System.out.println("Write your age:");
        int age = Integer.valueOf(scanner.nextLine());

        Personklasse input = new Personklasse(firstName, middleName, lastName, age);
        System.out.println(input.PersonklasseInfo());

    }

}
