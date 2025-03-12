package IfElse;

import java.util.Scanner;

public class PortoBeregner {
    public static void main(String[] args) {
        Scanner scannerWeight = new Scanner(System.in);
        System.out.println("Hello, ENTER what does your package weigh in gr.?=");
        int weight = scannerWeight.nextInt();
        //Lav en int variabel i din klasse som hedder pris. Denne sættes fra starten til værdien 0.
        int price = 0;
        double weightByPrice = 0;

        //Brug if-else til at afgøre hvad prisen på forsendelsen skal være.
        //Hvis brugeren skriver et antal gram som er 0 eller et negativt tal, eller mere end 2000 gram,
        // så skal programmet udskrive ”Et brev med denne vægt kan vi ikke sende”.
        if (weight <= 0) {
            System.out.println("We can't send a letter with this weight - sorry.");
            return;
        }

            if (weight <= 100) {
                weightByPrice = 29.00;
            } else if (weight <= 250) {
                weightByPrice = 58.00;
            } else if (weight <= 2000) {
                weightByPrice = 87.00;
                //Hvis brugeren skriver et antal gram som er 0 eller et negativt tal, eller mere end 2000 gram,
                // så skal programmet udskrive ”Et brev med denne vægt kan vi ikke sende”.
            } else {
                System.out.println("We can't send a letter with this weight - sorry.");
                return;
            }
            //I stedet for at skrive prisen ud med System.out.println inde i hver if-sætning sættes værdien af variablen pris som så først udskrives til sidst.
            System.out.println("The price for sending the letter with the weight of " + weight + " gram is " + weightByPrice + " kr.");

        }
    }



//Portoberegner
//
//1.	Lav en klasse der hedder Portoberegner.
//2.	Portoberegner-klassen har en Scanner der kan læse ind fra tastaturet hvor meget et brev vejer. Vægten angives i hele gram.
//3.	Gå ind på PostNords hjemmeside og se hvad det koster at sende et brev i Danmark. Din portoberegner skal kunne regne ud hvad det koster at sende breve i Danmark op til og med 2000 gram.
//4.	Lav en int variabel i din klasse som hedder pris. Denne sættes fra starten til værdien 0.
//5.	Brug if-else til at afgøre hvad prisen på forsendelsen skal være. I stedet for at skrive prisen ud med System.out.println inde i hver if-sætning sættes værdien af variablen pris som så først udskrives til sidst.
//6.	Hvis brugeren skriver et antal gram som er 0 eller et negativt tal, eller mere end 2000 gram, så skal programmet udskrive ”Et brev med denne vægt kan vi ikke sende”.