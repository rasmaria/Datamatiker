package Array;
import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {


        int[] list = {2, 18, 6, -4, 5, 1};
        for (int i = 0; i < list.length; i++) {
            list[i] = list[i] + (list[i] / list[0]);
        }
        System.out.println(Arrays.toString(list));

        double[] numbersPow = {4.5, 25.3, 12.1, 34.0, 15.5};
        //Loop der itererer gennem arraeyt og løfter hvert element i anden potens
        for (int i = 0; i < numbersPow.length; i++) {
            numbersPow[i] = Math.pow(numbersPow[i], numbersPow[i]);

        }
        double[] numbersSqr = {4.5, 25.3, 12.1, 34.0, 15.5};
        //Loop der itererer gennem arraeyt og kvadratroden af hvert element
        for (int i = 0; i < numbersSqr.length; i++) {
            numbersSqr[i] = Math.sqrt(numbersSqr[i]);

        }
        //Leder efter værdien 34.0 i loop:
        double[] numbersFind = {4.5, 25.3, 12.1, 34.0, 15.5};
         for (int i = 0; i < numbersFind.length; i++) {
            if (numbersFind[i] == 34.0) {
                System.out.println("Hurra! Jeg fandt 34.0. Det stod på index " + i);
                }
            }

        //Skriv et for-loop der finder den mindste værdi i arrayet.
        double[] numbersMin = {4.5, 25.3, 12.1, 34.0, 15.5};
        double min = numbersMin[0];
        for (int i = 0; i < numbersFind.length; i++) {
            if (numbersMin[i] < min) min = numbersMin[i];
        }
        //Skriv et for-loop der finder den største værdi i arrayet.
        double[] numbersMax = {4.5, 25.3, 12.1, 34.0, 15.5};
        double max = numbersMax[0];
            for (int i = 0; i < numbersFind.length; i++) {
                if (numbersMax[i] > max) max = numbersMax[i];
            }

         System.out.println(Arrays.toString(numbersPow));
         System.out.println(Arrays.toString(numbersSqr));
         System.out.println(min);
         System.out.println(max);
    }

}
