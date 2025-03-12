package ArrayList;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Collections;

public class Snackautomat {

    public Snackautomat() {
    }


    public int buy(int price, int paidValue) {

        if (paidValue < 0 || price < 0) {
            System.out.println("Error");
        }
        if (paidValue < price) {
            System.out.println("Error");
        }
        return paidValue - price;
    }
    public ArrayList<Integer> cashBack (int cashBackAmount) {
        ArrayList<Integer> coins = new ArrayList<Integer>();
        coins.add(500);
        coins.add(200);
        coins.add(100);
        coins.add(50);
        coins.add(20);
        coins.add(10);
        coins.add(5);
        coins.add(2);
        coins.add(1);


        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int coin : coins) {
            while (cashBackAmount >= coin) {
                cashBackAmount -= coin;
                result.add(coin);

            }
        }
        return result;
    }

}

