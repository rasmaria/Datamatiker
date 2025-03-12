package Basic;

import java.util.Scanner;

public class AgeName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Your name is " + name + " and your age is " + age + "!");
    }

}
