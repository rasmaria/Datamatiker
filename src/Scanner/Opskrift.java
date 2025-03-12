package Scanner;

import java.util.Scanner;

public class Opskrift {
    public static void main(String[] args) {
        //Bed brugeren om hvor mange cookies de ænsker at bage.
        System.out.println("How many cookies do you wish to bake?");
        Scanner inputAmountsOfCookies = new Scanner(System.in);
        int cookies = inputAmountsOfCookies.nextInt();

        //Spørg brugeren hvor meget mel der skal bruges til en cookie
        System.out.println("How much grams of flour do you need for 1 cookie");
        Scanner inputGramsOfFlour = new Scanner(System.in);
        int flour = inputGramsOfFlour.nextInt();

        //Beregn mængden af mel der skal til og print det til brugeren.
        System.out.println("You need " + (flour * cookies) + " grams of flour to bake " + cookies + " cookies." );
    }
}


//Scanner.Opskrift
//
//Lav et Java program der kan beregne den mængde mel der skal bruges i en cookie opskrift,
// afhængigt af hvor mange cookies man vil bage, ud fra en simpel opskrift.
//1.	Bed brugeren om hvor mange cookies de ænsker at bage.
//2.	Spørg brugeren hvor meget mel der skal bruges til en cookie (find på et tal eller googl det!)
//3.	Beregn mængden af mel der skal til og print det til brugeren.

