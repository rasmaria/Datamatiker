package ArrayList;

import java.util.Arrays;
import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        int[] tabel = {2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5};
        int søgeTal = 5;

        boolean fundet = false;
        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] == søgeTal) {
                System.out.println("Fundet på position: " + i);
                fundet = true;
            }
        }
        if (!fundet) {
            System.out.println("Elementet blev ikke fundet");
        }

        ArrayList<Integer> tabel2 = new ArrayList<Integer> (
                Arrays.asList(2, 5, 7, 4, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5));
        int nytTal = 8;

        boolean nyFundet = false;
        for (int i = 0; i < tabel2.size(); i++) {
            if (tabel2.get(i) == nytTal) {
                System.out.println("ArrayList: Fundet på position: " + i);
                nyFundet = true;
            }
        }
        if (!nyFundet) {
            System.out.println("ArrayList: Elementet blev ikke fundet");
        }

    }

}
