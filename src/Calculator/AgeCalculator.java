package Calculator;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday =LocalDate.of(1994, 10, 26);
        int years = Period.between(birthday, today).getYears();
        int months = Period.between(birthday, today).getMonths();
        int days = Period.between(birthday, today).getDays();

        System.out.println("Today is " + today);
        System.out.println("Birthday is " + birthday);
        System.out.print("You are: ");
        System.out.print(years + " years, ");
        System.out.print(months + " months, ");
        System.out.print(days + " days");
        System.out.print(" old");
    }
}
