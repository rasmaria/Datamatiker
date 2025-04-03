package FileInputOutput.FileExample;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileExample {

    public static void main(String[] args) {

        Scanner scanner = null;

        try {
            File file = new File("/Users/mariafogt/Documents/KEA/Programmering/Datamatiker 2025/src/FileInputOutput/FileExample/data.txt");
            FileWriter writer = new FileWriter(file);
            if (file.createNewFile()) {
                System.out.println("File created with name: " + file.getName());
                writer.write("Hej, dette er en test.\n");
                writer.write("Her er der en til sætning.\n");
                writer.close();
                System.out.println("Succesfully added lines to file.");
            } else {
                System.out.println("File already exists");
                writer.write("Hej, dette er en test.\n");
                writer.write("Her er der en til sætning.\n");
                writer.close();
                System.out.println("Succesfully added lines to file.");
            }
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
//
//        try {
//            FileWriter writer = new FileWriter("/Users/mariafogt/Documents/KEA/Programmering/Datamatiker 2025/src/FileInputOutput/FileExample/data.txt");
//            writer.write("Hej, dette er en test.\n");
//            writer.write("Her er der en til sætning.\n");
//            writer.close();
//            System.out.println("Succesfully added lines to file.");
//        } catch (IOException e) {
//            System.out.println("Error");
//            e.printStackTrace();
//        }

//        try {
//            PrintStream outFile = new PrintStream(new File("/Users/mariafogt/Documents/KEA/Programmering/Datamatiker 2025/src/FileInputOutput/FileExample/data.txt"));
//            outFile.println("Her er der endnu en linje");
//            Random random = new Random();
//            for (int i = 0; i < 10; i++) {
//                outFile.println(random.nextInt(6) +1);
//            }
//            outFile.close();
//
//        } catch (FileNotFoundException e) {
//            System.out.print("File not found.");
//        }




        try {

            scanner = new Scanner(new File("src/FileInputOutput/FileExample/data.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();

        }catch (FileNotFoundException e) {
            System.out.printf("File not found.");
        }

    }
}


//Arbejde med Filer
//Opret en ny Java-klasse, der hedder FileExample.
//Skriv til en fil:
//Programmet skal oprette eller overskrive en tekstfil med navnet data.txt. Indsæt to eller flere linjer tekst i filen. For eksempel kunne du skrive noget i retning af:
//“Hej, dette er en test.”
//“Her er der en til sætning.”
//Sørg for, at filen bliver lukket korrekt efter skrivningen. (ved at bruge variabelNavn.close())
//Læs fra filen:
//Efter at have skrevet til filen, skal dit program åbne data.txt og læse indholdet.
//Læs filen linje for linje, og udskriv hver linje til konsollen.
//Ligesom ved skrivning skal du sikre, at filstrømmen bliver lukket korrekt.
