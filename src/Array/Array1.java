package Array;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] tal = new int[10];
        System.out.println(tal[0]); //Printer første element i array (Index0)
        int lastElement = tal[tal.length -1];//Printer sidste element i array (Index?) som i dette tilfælde er Index9
        System.out.println(lastElement);


        int[] data = {27, 51, 33, -1, 101};


        int[] numbers = new int[8];
        numbers[1] = 4;
        numbers[4] = 99;
        numbers[7] = 2;

        int x = numbers[1];
        numbers[x]= 44;
        numbers[numbers[7]] = 11;

        System.out.println(Arrays.toString(numbers));


    }

}
