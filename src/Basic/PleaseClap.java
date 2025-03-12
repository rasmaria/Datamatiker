package Basic;

import java.util.Scanner;

public class PleaseClap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //Udskriv sætning med emoji i mellemrummene
        System.out.println(sentence.replace(" ", "👏🏻"));

    }
}
//OPGAVEN: `👏`
//Skriv et program der kan erstatte alle mellemrum med `👏`
//I am happy today
//Bliver til:
//I👏AM👏HAPPY👏TODAY

//Start med at importere Scanner
//Indsæt så Scanner i teksten med =    "Scanner input = new Scanner(System.in):"
//Husk at den ikke behøver at hedde input, det er bare det navn vi giver den.