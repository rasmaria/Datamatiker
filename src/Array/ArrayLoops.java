package Array;

public class ArrayLoops {
    public static void main(String[] args) {
        //Lav et tomt array som kan indeholde 8 elementer af typen int.
        int[] numbers = new int[8];
        //Assign værdien 34 på den første plads i arrayet, og assign værdien 117 på den sidste plads i arrayet.
        numbers[0] = 34;
        numbers[7] = 117;
        //Skriv et for-loop der itererer over arrayet og udskriver alle værdierne – hvad udskrives?
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            //Den printer 34, 0, 0, 0, 0, 0, 0, 117 da de andre ikke har fået assignet en værdi
        }
        //Lav et array med Strings, som er 3 elementer langt og indeholder værdierne ”Hej”, ”med” og ”dig”.
        String[] ord = {"Hej", "med", "dig"};
        //Lav et for each-loop der itererer over arrayet og udskriver de tre Strings,
        for (String sentence : ord){
            //men med mellemrum imellem (dvs. Hej med dig og ikke Hejmeddig, eller ordene ovenover hinanden).
            System.out.print(sentence + " ");
        }
        System.out.println();
        //Lav et array med doubles som indeholder værdierne 3.4, 2.5, 1.2, 6.7
        Double[] doubleNumbers = {3.4, 2.5, 1.2, 6.7};
        //Udskriv den værdi der står på index 2.
        System.out.println(doubleNumbers[2]);
        //Udskriv også længden på arrayet.
        System.out.println(doubleNumbers.length);
        //FEJL da der ikke er en index 4 endnu (Hvad sker der hvis du forsøger at udskrive en værdi på index 4?)



    }
}





//Array + loop
//
//Opgave med arrays
//1.	Lav en klasse du kan bruge til at lave opgaverne i.
//2.	Lav et tomt array som kan indeholde 8 elementer af typen int.
//3.	Assign værdien 34 på den første plads i arrayet, og assign værdien 117 på den sidste plads i arrayet.
//4.	Skriv et for-loop der itererer over arrayet og udskriver alle værdierne – hvad udskrives?
//5.	Lav et array med Strings, som er 3 elementer langt og indeholder værdierne ”Hej”, ”med” og ”dig”.
//6.	Lav et for each-loop der itererer over arrayet og udskriver de tre Strings, men med mellemrum imellem (dvs. Hej med dig og ikke Hejmeddig, eller ordene ovenover hinanden).
//7.	Lav et array med doubles som indeholder værdierne 3.4, 2.5, 1.2, 6.7. Udskriv den værdi der står på index 2. Udskriv også længden på arrayet. Hvad sker der hvis du forsøger at udskrive en værdi på index 4?