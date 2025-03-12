package OOP;

import java.util.Random;

public class MethodOverload {
    public static void main(String[] args) {
        int addResult1 = addNumbers(2, 3);
        double addResult2 = addNumbers(3.21, 5.45);
        int addResult3 = addNumbers(2, 3, 5);
        System.out.println(addResult1);
        System.out.println(addResult2);
        System.out.println(addResult3);

        addNumbers();

        //ELLER
        MethodOverload newClassMethod = new MethodOverload();
        newClassMethod.addNumbers1();

    }
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    public static double addNumbers(double a, double b) {
        return a + b;
    }
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
    public static void addNumbers() {
        Random r = new Random();
        System.out.println((r.nextInt(6) +1) + (r.nextInt(6) + 1));
    }
    public void addNumbers1() {
        Random r = new Random();
        System.out.println((r.nextInt(6) +1) + (r.nextInt(6) + 1));
    }
}
