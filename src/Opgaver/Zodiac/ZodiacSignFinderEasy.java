package Opgaver.Zodiac;

import java.util.Scanner;

public class ZodiacSignFinderEasy {
    public static void main(String[] args) {

        //Bed din bruger om at skrive måneden for deres fødslesdag som et tal (1-12), og gem det i en variabel.
        System.out.println("Please enter the month you were born in from 1-12:");
        Scanner inputMonth = new Scanner(System.in);
        int month = inputMonth.nextInt();

        //Bed din bruger om at skrive dagen for deres fødselsdag som et tal (1-31), og gem det i en anden variabel.
        System.out.println("Please enter the date you were born on from 1-31:");
        Scanner inputDay = new Scanner(System.in);
        int day = inputDay.nextInt();

        //Brug if – else statements til at bestemme deres stjernetegn ud fra brugerinput.

        String zodiacSign = "";

        if ((month == 1 && day <= 20) || (month == 12 && day >= 22)) {
            zodiacSign = "Capricorn";
        } else if ((month == 1 && day >= 21) || (month == 2 && day <= 18)) {
            zodiacSign = "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            zodiacSign = "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            zodiacSign = "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            zodiacSign = "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            zodiacSign = "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            zodiacSign = "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            zodiacSign = "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            zodiacSign = "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            zodiacSign = "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            zodiacSign = "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            zodiacSign = "Sagittarius";
        }

        // Udskriv det samlede resultat
        System.out.println("Your zodiac sign is: " + zodiacSign + "!");



        //Find brugerens Kinesiske Stjernetegn, der er et dyr! Print også det kinesiste stjernetegn til brugeren.

        System.out.println("Please enter the year you were born in (YYYY):");
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        String chineseZodiac = "";

        switch (year % 12) {
            case 0:  chineseZodiac = "Monkey"; break;
            case 1:  chineseZodiac = "Rooster"; break;
            case 2:  chineseZodiac = "Dog"; break;
            case 3:  chineseZodiac = "Pig"; break;
            case 4:  chineseZodiac = "Rat"; break;
            case 5:  chineseZodiac = "Ox"; break;
            case 6:  chineseZodiac = "Tiger"; break;
            case 7:  chineseZodiac = "Rabbit"; break;
            case 8:  chineseZodiac = "Dragon"; break;
            case 9:  chineseZodiac = "Snake"; break;
            case 10: chineseZodiac = "Horse"; break;
            case 11: chineseZodiac = "Goat"; break;
        }

        // Udskriv resultatet
        System.out.println("Your Chinese Opgaver.Zodiac sign is: " + chineseZodiac);
}
}

//Stjernetegn
//
//1.	Lav en ny Java class der hedder Opgaver.Zodiac.ZodiacSignFinder.
//2.	Lav et Scanner objekt inde i main metoden, der kan læse inputs fra brugeren.
//3.	Bed din bruger om at skrive måneden for deres fødslesdag som et tal (1-12), og gem det i en variabel.
//4.	Bed din bruger om at skrive dagen for deres fødselsdag som et tal (1-31), og gem det i en anden variabel.
//5.	Brug if – else statements til at bestemme deres stjernetegn ud fra brugerinput.
//6.	Print brugerens stjernetegn.
//Bonus: Find brugerens Kinesiste Stjernetegn, der er et dyr! Print også det kinesiste stjernetegn til brugeren.
