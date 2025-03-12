package OOP;

public class ScrabbleMainPRIVATE {
    public static void main(String[] args) {
        //4.	Skriv en main metode, der opretter et Tile-objekt med bogstavet Z og værdien 10,
        // og brug derefter printTile til at vise objektets tilstand.
        //5.	Opret getter og setter for hver af attributterne.
        ScrabblePRIVATE scrabble1 = new ScrabblePRIVATE('Z', 10);
        System.out.println(scrabble1.getLetter());
        System.out.println(scrabble1.getValue());
    }
}
