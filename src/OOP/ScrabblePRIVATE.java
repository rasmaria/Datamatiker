package OOP;

public class ScrabblePRIVATE {
    //1.	Lav klasse ved navn Tile, der repræsenterer Scrabble-fliser.
    // Instanstvariablerne skal indeholde en character det hedder letter og en int der hedder value.

    //5.	Opret getter og setter for hver af attributterne. (PRIVATE)
    private char letter;
    private int value;

    //2.	Skriv en konstruktør, der tager parametrene: letter og value, og initialiserer instansvariablerne.
    public ScrabblePRIVATE(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }
    //5.	Opret getter og setter for hver af attributterne.
    public char getLetter() {
        return letter;
    }
    //5.	Opret getter og setter for hver af attributterne.
    public int getValue() {
        return value;
    }
    //3.	Skriv en metode ved navn printTile, der tager et Tile-objekt som en parameter og viser instansvariablerne i et læsevenligt format.
    public void printScrabble() {
        System.out.println("Scrabble tiles letter is: " + this.letter + ", and it has a value of: " + this.value + ".");
    }
}


//Scrabble
//
//I brætspillet Scrabble har hver brik et bogstav, som bruges til at stave ord i rækker og kolonner, og en score, som bruges til at bestemme værdien af ord.
//1.	Lav klasse ved navn Tile, der repræsenterer Scrabble-fliser. Instanstvariablerne skal indeholde en character det hedder letter og en int der hedder value.
//2.	Skriv en konstruktør, der tager parametrene: letter og value, og initialiserer instansvariablerne.
//3.	Skriv en metode ved navn printTile, der tager et Tile-objekt som en parameter og viser instansvariablerne i et læsevenligt format.
//4.	Skriv en main metode, der opretter et Tile-objekt med bogstavet Z og værdien 10, og brug derefter printTile til at vise objektets tilstand.
//5.	Opret getter og setter for hver af attributterne.