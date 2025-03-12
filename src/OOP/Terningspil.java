package OOP;
import java.util.Random;

public class Terningspil {
    public static void main(String[] args) {

        while (true) {

            Terning roll1 = new Terning();
            roll1.roll();

            Terning roll2 = new Terning();
            roll2.roll();

            System.out.println("First dice: " + (roll1.getFaceValue()));
            System.out.println("Second dice: " + (roll2.getFaceValue()));
            System.out.println("Sum of " + (roll1.getFaceValue()) + " and " + (roll2.getFaceValue()) + " = " + (roll1.getFaceValue() + roll2.getFaceValue()));
            System.out.println();

            if ((roll1.getFaceValue()) == 1 && (roll2.getFaceValue()) == 1) {
                System.out.println("Snake eyes!!");
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}
