package Array;

public class ArraySum {
    public static void main(String[] args) {
        int[] sumA = {2, 9, 9, 3, 10};
        int sum = 0;
        //Printer hvor mange elementer der er med i Arrayet
       System.out.println(sumA.length);
        //Printer summen løbende i loopet med de elementer der er med i Arrayet
        for(int i = 0; i < sumA.length; i++) {
            sum += sumA[i];
            System.out.println(sum);
        }
    }
}
