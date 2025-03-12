package Enum;
import java.util.Scanner;

public class SchoolOrWeekendIfElse {
    public static void main(String[] args) {

        int userChoice;
        Weekdays weekday = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a weekday from 1-7 and press ENTER:");
        System.out.println("1 - Monday");
        System.out.println("2 - Tuesday");
        System.out.println("3 - Wednesday");
        System.out.println("4 - Thursday");
        System.out.println("5 - Friday");
        System.out.println("6 - Saturday");
        System.out.println("7 - Sunday");

        userChoice = scanner.nextInt();
        if (userChoice < 1 || userChoice > 7) {
            System.out.println("Invalid input!");
            return;
        }
        if (userChoice >= 1 && userChoice <= 5 ){
            System.out.println("It's weekday and you have to go to school.");
        }
        if (userChoice == 1) {
            System.out.println("It's monday again....");
            return;
        } else if (userChoice == 5) {
            System.out.println("But it's weekend when school is over!");
            return;
        } else if (userChoice == 6 || userChoice == 7 ){
            System.out.println("It's weekend, you don't need to get up....zzZZzz");
            return;
        } else {
            System.out.println("Error");
            return;
        }
    }
}

//Opgave som ikke kan løses med switch (men med if-else)
//
//9.	Nogle gange kan en switch ikke rigtig bruges til at løse det problem man har.  Under punkt 8 ovenfor afgør en switch hvad der skal udskrives. I den følgende opgave kan man ikke bruge en switch, men er nødt til at løse problemet med if-else. Problemet opstår på grund af det lille ord OGSÅ!
//10.	Start med at udkommentere den sidste af de to switch-statements (den fra punkt 8).
//11.	Skriv kode der løser nedenstående, ved hjælp af if-else-statements:
//12.	Hvis det er hverdag skal programmet skrive ”Du skal i skole”.
//13.	Hvis det er mandag skal programmet OGSÅ udskrive: ”Det er mandag igen…”.
//
//14.	Hvis det er fredag skal programmet OGSÅ udskrive ”Men du har weekend når du har fri!”.
//15.	Hvis det er weekend skal programmet skrive: ”Det er weekend, bare sov videre…”.