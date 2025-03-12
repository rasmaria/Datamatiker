package Scanner;

import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {

        //Bed din bruger om at skrive deres navn, læs svaret ved hjælp af Scanner og gem navnet i en variabel.
        System.out.println("Please write you name and press 'Enter': ");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();

        //Bed din bruger om deres yndlingsfarve, læs svaret ved hjælp af Scanner og gem navnet i en variabel.
        System.out.println("Now, please write your favorite color and press 'Enter': ");
        Scanner inputColor = new Scanner(System.in);
        String color = inputColor.nextLine();

        //Print en opsummerende besked hvor du skriver alt det info ud som du har fået om din bruger.
        System.out.println("Hi " + name + "! Your favorite color is " + color + "!");

    }




}



// Userinfo
//
//1.	Lav en ny Java klasse der hedder Scanner.UserInfo.
//2.	Lav et Scanner objekt inde i main metoden, der kan læse inputs.
//3.	Bed din bruger om at skrive deres navn, læs svaret ved hjælp af Scanner og gem navnet i en variabel.
//4.	Bed din bruger om deres yndlingsfarve, læs svaret ved hjælp af Scanner og gem navnet i en variabel.
//5.	Print en opsummerende besked hvor du skriver alt det info ud som du har fået om din bruger.

