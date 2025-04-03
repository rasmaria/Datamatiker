package FileInputOutput.FileFunAppending;

import java.io.*;

public class FileFunAppending {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        FileOutputStream output = null;
        try {
            output = new FileOutputStream("src/FileInputOutput/FileFunAppending/output.txt");
            PrintStream printStream = new PrintStream(output);
            printStream.println("Hej med dig");
            printStream.println("Woop woop!");
        } catch (FileNotFoundException e) {
            System.out.println("ERROR");
        }
    }
}

//Filskrivning
//1. Opret klassen FileFunAppending.
//2. Skriv main->run.
//3. Opret run-metoden med tom parameterliste.
//4. Opret en FileOutputStream-instans med filnavnet ”output.txt”
//.
//5. Opret en instans af PrintStream med FileOutputStream-instansen som argument.
//6. IntelliJ foreslår to løsninger. Vælg ”Surround with try/catch”. Skriv resten af koden i try-blokken.
//7. Kald println-metoden på PrintStream-objektet et par gange med noget tekst.
//8. Kør programmet og se om linjerne er blevet tilføjet i filen.
