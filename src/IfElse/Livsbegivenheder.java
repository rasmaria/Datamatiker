package IfElse;

public class Livsbegivenheder {
    public static void main(String[] arch){
        int alder = 0;
        while (alder <= 99) {
            System.out.println("Alder: " + alder);

            if (alder == 6)
                System.out.println(" - starter i folkeskolen");
            if (alder == 16)
                System.out.println(" - må købe øl og vin lovligt");
            if (alder == 18)
                System.out.println(" - myndig");
            if (alder == 29)
                System.out.println(" - gennemsnits alder for kvinder for at blive mor");
            if (alder == 67)
                System.out.println(" - pension hvis du er heldig");
            if (alder == 40)
                System.out.println(" - midtlivskrisen");
            if (alder == 25)
                System.out.println(" - kvartlivskrisen");
            if (alder == 99)
                System.out.println(" - gamle Ole");

            alder++;


        }

    }
}
