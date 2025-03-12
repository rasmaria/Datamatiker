package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;


public class hemmeligOrd {
    public static void main(String[] args) {
        ArrayList<String> hemmeligOrd = new ArrayList<String>();
        hemmeligOrd.add("frisbee");
        hemmeligOrd.add("kridt");
        hemmeligOrd.add("nesquick");

        Scanner scanner = new Scanner(System.in);

        //Giv brugeren flere forsøg til at gætte.
        while (true) {
            System.out.println("Guess a word from the list");
            String guess = scanner.nextLine();

            //4.	Tjek om gættet er i listen og giv besked til brugeren. (Hint brug den indbyggede metode .contains()).
            if (hemmeligOrd.contains(guess.toLowerCase())) {
                System.out.println("Yay! Correct guess!");
                break;
            } else {
                System.out.println("Wrong answer, try again");
                continue;
            }
        }
    }
}
