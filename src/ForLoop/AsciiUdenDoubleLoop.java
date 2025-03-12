package ForLoop;

import java.util.Scanner;

public class AsciiUdenDoubleLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pick a number from 1-100 and press enter:");
        int number = scanner.nextInt();
        char character = '*';
        String linje = "";

        for (int i = 0; i <= number; i++) {
            linje += character;
            System.out.println(linje);
        }

        for (int i = 0; i <= number; i--) {
            linje += character;
            System.out.println(linje);
        }
    }
}

    //Ascii øvelse
//
//Denne øvelse går ud på at lave ascii art med loops.
//Bed din bruger om et tal. Gem tallet med Scanner.nextInt() i en variabel og lav en pyramide-form med '*' tegnet, således at hvis brugeren skrev 5, ville dette være dit putput i terminalen:
//1. *
//2. **
//3. ***
//4. ****
//5. *****
//
//Brug loops til at iterere over antalle af stjernerækker som du får fra din bruger.
//
//Lav en til ascii art generator der laver en omvendt pyramide:
//1. *****
//2. ****
//3. ***
//4. **
//5. *