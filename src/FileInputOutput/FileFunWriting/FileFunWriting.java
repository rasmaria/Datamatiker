package FileInputOutput.FileFunWriting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String[] args) {
        run();
    }
    public static void run() {
        File text = new File("/Users/mariafogt/Documents/KEA/Programmering/Datamatiker 2025/src/FileInputOutput/FileFunWriting/text.txt");

        try {
            PrintStream outfile = new PrintStream("/Users/mariafogt/Documents/KEA/Programmering/Datamatiker 2025/src/FileInputOutput/FileFunWriting/text.txt");
            outfile.println("Here's one line");
            outfile.println("And here's another line");
            outfile.println("");
            outfile.println("And a last line");
            outfile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}


//Filskrivning
//1. Opret klassen FileFunWriting.
//2. Skriv main->run.
//3. Opret run-metoden med tom parameterliste.
//4. Opret et File-objekt med filnavnet ”output.txt”
//.
//5. Opret en instans af PrintStream med fil-objektet som argument.
//6. IntelliJ foreslår to løsninger. Vælg ”Surround with try/catch”. Skriv resten af koden i try-blokken.
//7. Kald println-metoden på PrintStream-objektet et par gange med noget tekst.
//8. Kør programmet og se filen tone frem i IntelliJ og åbn så filen og tjek indholdet.