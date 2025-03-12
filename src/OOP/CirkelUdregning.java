package OOP;
import java.util.Scanner;

public class CirkelUdregning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the radius of your circle?:");
        double radius = Double.valueOf(scanner.nextLine());
        Cirkel a = new Cirkel(radius);
        System.out.println("The area of a circle is : " + (a.cirkelAreal()));
    }
}
