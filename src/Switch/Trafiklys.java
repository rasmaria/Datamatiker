package Switch;

import java.util.Scanner;

public class Trafiklys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Bed brugeren om at skrive en farve
        System.out.println("Please enter one of the following colors and then press ENTER; \nred, yellow or green:");
        String colorInput = scanner.nextLine();
        boolean safeToCrossStreet = false;

//•	brug swithch statement til at printe det korrekte svar {"stop", "vent" eller "gå"}
        switch (colorInput) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Wait!");
                break;
            case "green":
                System.out.println("Go!");
                break;
        }
        System.out.println("\nIs it safe to cross the street? If yes, type yes and then ENTER. If no, type no and then ENTER.");
        String safetyInput = scanner.nextLine();

        if (safetyInput.equals("yes")) {
            System.out.println("It's safe to cross the street!");
        } else {
            System.out.println("It's not safe to cross the street!");
        }
        //•	Brug en ternary operator til at printe enten "Det er sikkert at krydse vejen" eller "Det er ikke sikkert at krydse vejen".
        String safetyResult = safeToCrossStreet ? "It's true, it's safe to cross the street!" : "It's still not safe to cross the street!";
        System.out.println(safetyResult);
    }

}
//Switch.Trafiklys
//
//Lav et Java program, der modtager et input fra brugeren: "rød", "gul"eller "grøn", og printer "stop", "vent" eller "gå".
//Brug swithch statement til at håndtere farverne og en boolean variabel til at checke om det er sikkert at krydse vejen.
//
//•	Bed brugeren om at skrive en farve
//•	brug swithch statement til at printe det korrekte svar {"stop", "vent" eller "gå"}
//•	Brug en ternary operator til at printe enten "Det er sikkert at krydse vejen" eller "Det er ikke sikkert at krydse vejen".