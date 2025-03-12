package Zodiac;

import java.util.Scanner;

public class ZodiacSignFinder {
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

        //January
        if (month == 1) {
            if (day <=20) {
                System.out.println("You are a Capricorn!");
            } else {
                System.out.println("You are a Aquarius!");
            }
        }

        //February
       else if (month == 2) {
            if (day <=18) {
                System.out.println("You are a Aquarius!");
            } else {
                System.out.println("You are a Pieces!");
            }
        }

        //March
       else if (month == 3) {
            if (day <=20) {
                System.out.println("You are a Pieces!");
            } else {
                System.out.println("You are a Aries!");
            }
        }
        //April
        else if (month == 4) {
            if (day <=19) {
                System.out.println("You are a Aries!");
            } else {
                System.out.println("You are a Taurus!");
            }
        }

        //May
        else if (month == 5) {
            if (day <=21) {
                System.out.println("You are a Taurus!");
            } else {
                System.out.println("You are a Gemini!");
            }
        }

        //June
       else if (month == 6) {
            if (day <=21) {
                System.out.println("You are a Gemini!");
            } else {
                System.out.println("You are a Cancer");
            }
        }

        //July
       else if (month == 7) {
            if (day <=22) {
                System.out.println("You are a Cancer!");
            } else {
                System.out.println("You are a Leo!");
            }
        }
        //August
       else if (month == 8) {
            if (day <=22) {
                System.out.println("You are a Leo!");
            } else {
                System.out.println("You are a Virgo!");
            }
        }
        //September
       else if (month == 9) {
            if (day <=22) {
                System.out.println("You are a Virgo!");
            } else {
                System.out.println("You are a Libra!");
            }
        }
        //October
       else if (month == 10) {
            if (day <=22) {
                System.out.println("You are a Libra!");
            } else {
                System.out.println("You are a Scorpio!");
            }
        }

        //November
       else if (month == 11) {
            if (day <=22) {
                System.out.println("You are a Scorpio!");
            } else {
                System.out.println("You are a Sagittarius!");
            }
        }

        //December
       else if (month == 12) {
            if (day <=21) {
                System.out.println("You are a Sagittarius!");
            } else {
                System.out.println("You are a Capricorn!");
            }
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

        System.out.println("Your Chinese Zodiac Sign is a: " + chineseZodiac + "!");


            }
}


//Stjernetegn
//
//1.	Lav en ny Java class der hedder Zodiac.ZodiacSignFinder.
//2.	Lav et Scanner objekt inde i main metoden, der kan læse inputs fra brugeren.
//3.	Bed din bruger om at skrive måneden for deres fødslesdag som et tal (1-12), og gem det i en variabel.
//4.	Bed din bruger om at skrive dagen for deres fødselsdag som et tal (1-31), og gem det i en anden variabel.
//5.	Brug if – else statements til at bestemme deres stjernetegn ud fra brugerinput.
//6.	Print brugerens stjernetegn.
//Bonus: Find brugerens Kinesiste Stjernetegn, der er et dyr! Print også det kinesiste stjernetegn til brugeren.
