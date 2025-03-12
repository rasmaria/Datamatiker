package SmartMetode;
import java.util.Arrays;

public class ReferenceSemantics {
    public static void main(String[] args) {
        int a = 5;
        int b = a; // Primitives are value types
        System.out.println(a + " " + b);

        //Value types, send copies of value

        a++;
        b *= 2;

        System.out.println(a + " " + b);

        minusThree(a);
        System.out.println(a);

        int[] pi = {3, 1, 4};
        int[] pizza = pi;
        int[] e = {2, 7, 1};

        System.out.println(Arrays.toString(pi));
        System.out.println(Arrays.toString(pizza));

        //Add +1 to index 0
        swapFirstTwoElements(pi);

        System.out.println(Arrays.toString(pi));
        System.out.println(Arrays.toString(pizza));
    }
    //value types send copies as parameters
    //changes made by methods are temporary

    public static void minusThree(int num) {
        num -= 3;
        System.out.println(num);
    }
    //Reference types send pointers/references as parameters
    // changes made by methods are PERMANENT

    public static void swapFirstTwoElements(int[] arr) {
        int firstElement = arr[0]; //Skal kalde firstElement = aar[0] her, da vi nedenunder giver arr[0] en ny værdi i arr[1)
        arr[0] = arr[1];
        arr[1] = firstElement;
    }

}
