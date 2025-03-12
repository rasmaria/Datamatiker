package Opgaver.Zodiac;

import java.util.Scanner;

public class ZodiacSignFinderSwitch {
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


        switch (month) {
            case 1 :
            if (day <=20) {
                System.out.println("You are a Capricorn!");
            } else {
                System.out.println("You are a Aquarius!");
        }
                break;

        //February
        case 2:
            if (day <=18) {
                System.out.println("You are a Aquarius!");
            } else {
                System.out.println("You are a Pieces!");
            }
            break;

        //March
       case 3:
            if (day <=20) {
                System.out.println("You are a Pieces!");
            } else {
                System.out.println("You are a Aries!");
            }
           break;

        //April
        case 4:
            if (day <=19) {
                System.out.println("You are a Aries!");
            } else {
                System.out.println("You are a Taurus!");
            }
            break;

        case 5:
            if (day <=21) {
                System.out.println("You are a Taurus!");
            } else {
                System.out.println("You are a Gemini!");
            }
            break;

        //June
            case 6:
            if (day <=21) {
                System.out.println("You are a Gemini!");
            } else {
                System.out.println("You are a Cancer");
            }
                break;

        //July
       case 7:
            if (day <=22) {
                System.out.println("You are a Cancer!");
            } else {
                System.out.println("You are a Leo!");
            }
           break;

        //August
       case 8:
            if (day <=22) {
                System.out.println("You are a Leo!");
            } else {
                System.out.println("You are a Virgo!");
            }
           break;

        //September
       case 9:
            if (day <=22) {
                System.out.println("You are a Virgo!");
            } else {
                System.out.println("You are a Libra!");
            }
           break;

        //October
      case 10:
            if (day <=22) {
                System.out.println("You are a Libra!");
            } else {
                System.out.println("You are a Scorpio!");
            }
          break;

        //November
        case 11:
            if (day <=22) {
                System.out.println("You are a Scorpio!");
            } else {
                System.out.println("You are a Sagittarius!");
            }
            break;

        //December
        case 12:
            if (day <=21) {
                System.out.println("You are a Sagittarius!");
            } else {
                System.out.println("You are a Capricorn!");
            }
            break;
        }


        //Find brugerens Kinesiske Stjernetegn, der er et dyr! Print også det kinesiste stjernetegn til brugeren.

        System.out.println("Please enter the year you were born in (YYYY):");
        Scanner inputYear = new Scanner(System.in);
        int year = inputYear.nextInt();
        String chineseZodiac = "";

        final int CURRENT_YEAR = 2025;

        //RAT
        for (int i= 1900; i <= CURRENT_YEAR; i+=12) {
            if(year == i) {
                chineseZodiac = "Rat";

        }
            }
        //BULL
        for (int i= 1901; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Bull";
            }
        }

        //TIGER
        for (int i= 1902; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Tiger";
            }
        }

        //BUNNY
        for (int i= 1903; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Bunny";
            }
        }

        //DRAGON
        for (int i= 1904; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Dragon";
            }
        }

        //SNAKE
        for (int i= 1905; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Snake";
            }
        }

        //HORSE
        for (int i= 1906; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Horse";
            }
        }

        //GOAT
        for (int i= 1907; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Goat";
            }
        }

        //MONKEY
        for (int i= 1908; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Monkey";
            }
        }

        //ROOSTER
        for (int i= 1909; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Rooster";
            }
        }

        //DOG
        for (int i= 1910; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Dog";
            }
        }

        //PIG
        for (int i= 1911; i <= CURRENT_YEAR; i+=12) {
            if (year == i) {
                chineseZodiac = "Pig";
            }
        }

        System.out.println("Your Chinese Opgaver.Zodiac Sign is a: " + chineseZodiac + "!");


            }
}


//Stjernetegn
//Stjernetegn - nu med Switch case
//
//Lav dit stjernetegns program om, så du bruger Switch case i stedet for if og if else:
//Fungerer ikke helt på samme måde med loops
