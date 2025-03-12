package ArrayList;

import java.util.ArrayList;

public class SnackautomatMain {
    public static void main(String[] args) {
        Snackautomat nyAutomat = new Snackautomat();
        System.out.println(nyAutomat.buy(40,100));
        int moneyReturn = nyAutomat.buy(40, 100);

        ArrayList<Integer> result = nyAutomat.cashBack(267 - moneyReturn);
        System.out.println("Byttepenge for 267 efter at have købt for " + moneyReturn + ": " + result);

    }
}
