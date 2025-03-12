package Basic;

import java.util.Scanner;

public class ClubHouse {
    public static void main(String[] args) {
        boolean isOldEnoughToEnter;
        Scanner inputAge = new Scanner(System.in);
        System.out.println("Enter Age:");
        int age = inputAge.nextInt();

        //man skal være fyldt 18 for at komme ind
        if (18 <= age) {
            isOldEnoughToEnter = true;
            System.out.println("Velkommen i klubhuset!");
        } else {
            isOldEnoughToEnter = false;
            System.out.println("Ud!");
        }
        System.out.println("Is person old enough? = " + isOldEnoughToEnter);
    }
}
