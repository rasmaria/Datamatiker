package FileInputOutput.FileFunReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFunReading {
    public static void main(String[] args) {

        run();
    }

    public static void run() {
        File file = new File("src/FileInputOutput/FileFunReading/text.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
            ;
        } catch (
                FileNotFoundException e) {
            System.out.print("File not found.");
        }
    }

}

//Få hul igennem
//1. Opret en tekstfil kaldet text.txt med nogle tekstlinjer.
//Der er et eksempel på side 2, som du kan kopiere.
//2. Opret klassen FileFunReading med main->run.
//3. Opret run-metoden.
//4. Opret en File-instans.
//5. Opret herefter en Scanner-instans med File-instansen som argument.
//6. IntelliJ giver to forslag. Vælg ”Surround with try/catch”
//. Skriv resten af koden i try-blokken.
//7. Lav en while-løkke, der tjekker hasNextLin() og læser filen med nextLine() og printer linjerne.