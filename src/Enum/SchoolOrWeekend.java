package Enum;
import java.util.Scanner;

public class SchoolOrWeekend {
    public static void main(String[] args) {
        //4.	Lav en int-variabel der hedder brugerValg.
        int userChoice;
        //6.	Lav en variabel af typen Ugedag, og kald den ugedag. Sæt dens værdi til null.
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

        //5.	Lav en scanner så man kan læse værdien af dag ind fra brugeren.
        userChoice = scanner.nextInt();
        //Brug et loop til at sørge for at man ikke kan skrive andre tal end tallene fra 1-7.
        if (userChoice < 1 || userChoice > 7) {
            System.out.println("Invalid input!");
            return;
        }

        //Lav en switch der sørger for at “omforme” int variablen brugerValg til en af værdierne i din Ugedag-enum.
        switch (userChoice) {
            case 1:
                weekday = Weekdays.Monday;
                break;
            case 2:
                weekday = Weekdays.Tuesday;
                break;
            case 3:
                weekday = Weekdays.Wednesday;
                break;
            case 4:
                weekday = Weekdays.Thursday;
                break;
            case 5:
                weekday = Weekdays.Friday;
                break;
            case 6:
                weekday = Weekdays.Saturday;
                break;
            case 7:
                weekday = Weekdays.Sunday;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        System.out.println("You chose " + weekday + "!");
        //8.	Lav én til switch hvor der udskrives “Det er hverdag!” eller “Det er weekend”,
        // alt efter hvilken værdi variablen ugedag har.

        String result = switch (weekday) {
            case Monday, Tuesday, Wednesday, Thursday, Friday -> "It's a Weekday.";
            case Saturday, Sunday -> "It's WEEKEND!";
            default -> "Invalid";
        };
        System.out.println(result);
    }
}


//1.	Skriv en enum der hedder Ugedag, med alle ugens dage i. Husk at skrive dem med store bogstaver.
//2.	Lav klasse der hedder SkoledageEllerWeekend, med en main-metode i.
//3.	Lav en “menu” af ugedage ved at skrive values ud fra din Ugedag-enum. Sæt et tal foran hver ugedag så brugeren kan vælge en int, svarende til hver dag i menuen. Bed brugeren om at vælge et tal.
//4.	Lav en int-variabel der hedder brugerValg.
//5.	Lav en scanner så man kan læse værdien af dag ind fra brugeren. Brug et loop til at sørge for at man ikke kan skrive andre tal end tallene fra 1-7. Hvis man skriver et andet tal skal programmet give en fejlmeddelelse, fx ”Du må kun skrive et tal fra 1-7. Prøv igen.”  Assign den værdi du læser ind fra scanneren til variablen brugerValg.
//6.	Lav en variabel af typen Ugedag, og kald den ugedag. Sæt dens værdi til null.
//7.	Lav en switch der sørger for at “omforme” int variablen brugerValg til en af værdierne i din Ugedag-enum. Det vil sige at hver case skal være en int, og for hver case skal variablen ugedag sættes til den tilsvarende enum-værdi (dvs 1 betyder Ugedag.MANDAG, osv).
//8.	Lav én til switch hvor der udskrives “Det er hverdag!” eller “Det er weekend”, alt efter hvilken værdi variablen ugedag har. HINT: der er en liste af muligheder for hver case.