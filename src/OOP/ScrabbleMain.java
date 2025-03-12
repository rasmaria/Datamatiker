package OOP;

public class ScrabbleMain {
    public static void main(String[] args) {
        //4.	Skriv en main metode, der opretter et Tile-objekt med bogstavet Z og værdien 10,
        // og brug derefter printTile til at vise objektets tilstand.
        Scrabble scrabble1 = new Scrabble('Z', 10);
        scrabble1.printScrabble();
    }
}
