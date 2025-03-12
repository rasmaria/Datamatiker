package Basic;

import java.util.Scanner;

//Tag en opgave du har løst fra en tidligere klasse (uden at lave en metode),
//og skriv den om, således at den nu indeholder en eller flere metoder.

public class PleaseClapRefaktorering {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //Udskriv sætning med emoji i mellemrummene
        System.out.println(sentence.replace(" ", "👏🏻"));

    }
}
