package Basic;

import java.util.Scanner;

public class EmployeeYearlySalary {
    public static void main(String[] args) {


        //KLASSISK
        double salaryHour = 200.36;
        System.out.println("Amount pr. hour: " + salaryHour);
        double workHours = 35;
        System.out.println("Hours pr. week: " + workHours);
        double resultIncome1 = workHours * salaryHour;
        System.out.println("You earn " + resultIncome1 + " pr. week before taxes.");
        System.out.println("That is " + resultIncome1 * 52 + " a year.");


        //Med Input
        System.out.println("\nNu vil jeg beregne hvad du tjener i timen udfra din månedsløn.");
        System.out.println("Hvad får du i løn om måneden?");
        Scanner inputMånedsløn = new Scanner(System.in);
        int månedsløn = inputMånedsløn.nextInt();
        double resultTimeløn = (månedsløn / 160);
        System.out.println("Ud fra din månedsløn på " + månedsløn + ", kan jeg udregne at du tjener " + resultTimeløn + " kr. i timen på en gennemsnitslig arbejdsuge.");
    }
}
