package Opgaver.TAMA;

import java.util.Scanner;

public class Main_SWITCH {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Loop game
        boolean playAgain = true;
        // Loop game
        while (playAgain) {
            //Welcome and choose between animal with scanner
        System.out.println("Hello and congratulations on your new Tamagotchi!\nWould you like to create a dog or a cat? Enter '1' for dog and '2' for cat.");
        int choice = scanner.nextInt();
        scanner.nextLine();

        //Scanner output for cat/dog

        Tamagotchi animal = null;
        if (choice == 1) {
            System.out.println("You have chosen DOG! Please give it a name:");
            String name = scanner.nextLine();
            System.out.println("Is it a small or a big dog? Enter '1' for small or '2' for big:");
            int race = scanner.nextInt();
            scanner.nextLine();
            System.out.println(name + " is a great name! Here is " + name + "!");
            if (race == 1) {
                System.out.println("૮⍝• ᴥ •⍝ა");
            } else if (race == 2) {
                System.out.println("      / \\__");
                System.out.println("     (    @\\___");
                System.out.println("     /         O");
                System.out.println("   /   (_____ /");
                System.out.println("  /_____/   U");
            }
            animal = new Dog(name, race);

        } else if (choice == 2) {
            System.out.println("You have chosen CAT! Please give it a name:");
            String name = scanner.nextLine();
            System.out.println("Does it live indoors or outdoors? Enter '1' for indoors or '2' for outdoors: ");
            int indoorOutdoor = scanner.nextInt();
            scanner.nextLine();
            System.out.println(name + " is a great name! Here is " + name + "!");
            animal = new Cat(name, indoorOutdoor);
            if (indoorOutdoor == 1) {
                System.out.println("      _____      ");
                System.out.println("     /     \\     ");
                System.out.println("    /       \\    ");
                System.out.println("   /         \\   ");
                System.out.println("  /___________\\  ");
                System.out.println("  |  /\\_/\\   |   ");
                System.out.println("  | ( o.o )  |   ");
                System.out.println("  |  > ^ <   |   ");
                System.out.println("  |__________|   ");
            } else if (indoorOutdoor == 2) {
                System.out.println("   /\\_/\\        /\\ ");
                System.out.println("  ( o.o )      /  \\ ");
                System.out.println("   > ^ <      /    \\ ");
                System.out.println("    | |      /______\\ ");
                System.out.println("   /   \\       || ");
                System.out.println("  /     \\      || ");
                System.out.println(" (   | |   )    || ");
                System.out.println("  |   | |   |   || ");
                System.out.println("  |   | |   |   || ");
            }
        } else {
            System.out.println("Error - please restart the game and choose 1 or 2.");
            return;
        }
        //Choose method to interact with Tamagotchi via scanner
        boolean continueGame = true;

        while (continueGame) {
            System.out.println("What would you like to do with " + animal.getName() + "? Enter one of the numbers from below:");
            System.out.println("1 - Play");
            System.out.println("2 - Feed");
            System.out.println("3 - Tak a nap");
            System.out.println("4 - Sleep");
            System.out.println("5 - Check status");
            System.out.println("6 - Play again");
            System.out.println("7 - Exit the game");
            int action = scanner.nextInt();

            //Method outputs + play again + end game

            switch (action) {
                case 1 -> System.out.println(animal.play());
                case 2 -> System.out.println(animal.feed());
                case 3 -> System.out.println(animal.nap());
                case 4 -> System.out.println(animal.sleep());
                case 5 -> System.out.println(animal.howAreYou());
                case 6 -> {
                    System.out.println("Play again");
                    System.out.println();
                    System.out.println();
                    continueGame = false;
                }
                case 7 -> {
                    System.out.println("Goodbye!");
                    playAgain = false;
                    continueGame = false;
                }
                default -> System.out.println("Can't read input. Please try again.");
            }

            }
        }
    }
}
