package OOP;
import java.util.Random;

//Class
class Terning {
    int MAX = 6;
    int faceValue;
    Random dice;

    //Constructor
    public Terning() {
        dice = new Random();
        roll();
    }

    //Method to returns values
    public void roll() {
        faceValue = dice.nextInt(MAX) +1;
    }
    public int getFaceValue() {
        return faceValue;
    }

}