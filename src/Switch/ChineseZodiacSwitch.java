package Switch;

import java.util.Scanner;

public class ChineseZodiacSwitch {
    public static void main(String[] args) {
        System.out.println("Please enter the year you were born in (YYYY):");
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        String chineseZodiac = "";

        final int CURRENT_YEAR = 2025;
        int zodiacCycle = (year - 1900) % 12;

        //SWITCH MANØVRE

        switch (zodiacCycle) {
            case 0:
                chineseZodiac = "Rat";
                break;
            case 1:
                chineseZodiac = "Bull";
                break;
            case 2:
                chineseZodiac = "Tiger";
                break;
            case 3:
                chineseZodiac = "Bunny";
                break;
            case 4:
                chineseZodiac = "Dragon";
                break;
            case 5:
                chineseZodiac = "Snake";
                break;
            case 6:
                chineseZodiac = "Horse";
                break;
            case 7:
                chineseZodiac = "Goat";
                break;
            case 8:
                chineseZodiac = "Monkey";
                break;
            case 9:
                chineseZodiac = "Rooster";
                break;
            case 10:
                chineseZodiac = "Dog";
                break;
            case 11:
                chineseZodiac = "Pig";
                break;
        }

        System.out.println("Your Chinese Zodiac Sign is a: " + chineseZodiac + "!");

    }
}

//Stjernetegn - nu med Switch case
//
//Lav dit stjernetegns program om, så du bruger Switch case i stedet for if og if else:
//Fungerer ikke helt på samme måde med loops