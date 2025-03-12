package Enum;
import java.util.Scanner;

public class ColorTest {
//🟢 Trin 1: Lav en enum med tre farver: RØD, GRØN, BLÅ.
    enum Color {
        RED(1),
        GREEN(2),
        BLUE(3);

        private int number;

        Color(int number) {
            this.number = number;
        }
    }
    //🔵 Trin 2: Lav en main-metode, hvor brugeren vælger en farve ved at skrive et tal (1-3).

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a number between 1-3 and then ENTER");
        System.out.println("1 - Red");
        System.out.println("2 - Green");
        System.out.println("3 - Blue");

        int numberInput = scanner.nextInt();

        //🔴 Trin 3: Programmet udskriver den valgte farve.
        switch (numberInput) {
            case 1:
                System.out.println(Color.RED);
                break;
            case 2:
                System.out.println(Color.GREEN);
                break;
            case 3:
                System.out.println(Color.BLUE);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
//🟢 Trin 1: Lav en enum med tre farver: RØD, GRØN, BLÅ.
//🔵 Trin 2: Lav en main-metode, hvor brugeren vælger en farve ved at skrive et tal (1-3).
//🔴 Trin 3: Programmet udskriver den valgte farve.