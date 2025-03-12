package Array;
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        int[] list = {2, 18, 6, 8, 5, 7, 1};

        avarage(list);
        listMax(list);
        listMin(list);


    }
    //Metode der finder avarage af alle elementerne i arrayet og returnere sum som double
   public static void avarage(int[] arr) {
       double sum = arr[0];
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       double sumAvarage = sum / arr.length;
       System.out.println("Sum: " + sum);
       System.out.println("Average: " + sumAvarage);

   }

  //Metode der finder en int maxværdi i array
    public static void listMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
         System.out.println("Highest number in array: " + max);
    }
    //Metode der finder en int mindsteværdi i array
        public static void listMin(int[] arr) {
            int min = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) min = arr[i];
            }
            System.out.println("Lowest number in array: " + min);
    }


}
