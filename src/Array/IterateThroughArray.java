package Array;

public class IterateThroughArray {
    public static void main(String[] args) {
        //Lav en main-metode og et double-array med værdierne {4.5, 25.3, 12.1, 34.0, 15.5 }.
        double[] numbers = {4.5, 25.3, 12.1, 34.0, 15.5};

        double min = numbers[0];
        double max = numbers[0];

        //Skriv et for-loop der itererer gennem et array, opløfter hvert tal i anden potens
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Skriv et for-loop der itererer gennem et array, opløfter hvert tal i anden potens = " + Math.exp(numbers[i]));
            //Skriv et for-loop der finder den mindste værdi i arrayet.
            if (numbers[i] < min) min = numbers[i];
            //Skriv et for-loop der finder den største værdi i arrayet.
            if (numbers[i] > max) max = numbers[i];
            //Skriv et for-loop der leder efter værdien 12.1.
            if (numbers[i] == 12.1) {
                System.out.println("Hurra! Jeg fandt 12.1. Det stod på index " + i);
            }
        }
        System.out.println("Skriv et for-loop der finder den mindste værdi i arrayet = " + min);
        System.out.println("Skriv et for-loop der finder den største værdi i arrayet = " + max);
    }
}







//1.	Start med at skrive en klasse der hedder Array.IterateThroughArray
//2.	Lav en main-metode og et double-array med værdierne {4.5, 25.3, 12.1, 34.0, 15.5 }.
//3.	I de næste del-opgaver skal du skrive for-loops der gør forskellige ting. Udkommenter koden fra den tidligere opgave før du går i gang med den næste. Lad være med at slette den, eller lave om i den løsning du allerede har fået til at virke – så har du løsningen til at kigge på en anden gang.
//4.	Til næste opgave skal vi lige kigge i Javas dokumentation. Søg i din browser på ”java 17 docs”. Gå ind på linket til Oracle Help Center. Nu er du inde på den officielle Java-dokumentation. Søg på java.lang.math i søgefeltet øverst til højre. Nu er du inde på Math-klassens dokumentation. Scroll ned og se alle de metoder Math-klassen indeholder. Fordi Math-klassens metoder er statiske behøver du ikke at lave et nyt objekt med new. I stedet kaldes metoderne således, fx hvis man vil finde kvadratroden af tallet 4.3:
// double kvadratrod = Math.sqrt(4.3);
//
//I næste opgave skal vi ikke tage en kvadratrod, men opløfte tal i en potens. På engelsk hedder potens ”power”. Find den metode i Math-klassen der kan det.
//5.	Skriv et for-loop der itererer gennem et array, opløfter hvert tal i anden potens og skriver det ud til konsollen.
//6.	Skriv et for-loop der finder den mindste værdi i arrayet.
//7.	Skriv et for-loop der finder den største værdi i arrayet.
//8.	Skriv et for-loop der leder efter værdien 12.1. Hvis det tal findes i arrayet skal programmet udskrive ”Hurra! Jeg fandt 12.1. Det stod på index ” + hvilket index det så end stod på.