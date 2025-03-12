package OOP.BIKES;

public class LadCykel extends Cykel {
    int passengers;
    Cyklist cyklist;


    public LadCykel(String color, int wheels, double newPrice, double km, int passengers) {
        super(color, wheels, newPrice, km);
        this.passengers = passengers;
    }
    //4.	Udbyg Ladcykel-klassen så den kan have en cyklist der kører ladcyklen lige nu.
    // Definér følgende metoder på Ladcykel-klassen og afprøv klassen (lav en anden klasse med en main-metode).


    //En cyklist sætter sig i ladcyklen hvis der ikke sidder én i forvejen.
    //Returnerer om det kunne lade sig gøre at sætte sig ind.
    public boolean enCyklistSaetterSig(Cyklist c) {
        if (cyklist != null) {
            System.out.println("There is no space for an extra person.");
            return false;
        } else {
            cyklist = c;
            System.out.println("You can sit down in the ladcykel.");
            return true;
        }
    }

    //returnerer et cyklist-objekt eller null hvis der ikke er nogen cyklist på ladcyklen.
    public Cyklist hvemKoererLadcyklen() {
        if (cyklist != null) {
            System.out.println(cyklist.toString() + " is driving the bike");
        } else {
            System.out.println("No one is driving the bike.");
        }
        return cyklist;
    }

    //cyklisten forlader ladcyklen, og metoden returnerer cyklisten eller null hvis der ikke er nogen cyklist.
    public Cyklist cyklistenStigerUd() {
        if (cyklist != null) {
            Cyklist tilbage = cyklist;
            cyklist = null;
            return tilbage;
        } else {
            return null;
        }
    }
    //giver en beskrivelse af ladcyklen
    public String toString() {
        return "Ladcyklen has " + super.getWheels() + " wheels and the color is " + super.getColor() + "." + "\nThe bike is transporting " + this.passengers + " passenger/passengers." + "\nIt can drive up to " + super.getKm() + "/h and if you wat to buy it yourself the price is: " + super.getNewPrice() + ".";

    }
}
