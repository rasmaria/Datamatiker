package Enum;

public class Examples {
    public static void main(String[] args) {
        Weekdays day = Weekdays.Friday;

        if (day == Weekdays.Friday){
            System.out.println("Yay it's friday!");
        }
        for (Weekdays allDays : Weekdays.values()) {
            System.out.println(allDays);
        }
        System.out.println(Cereals.COCO_PUFFS.levelOfTaste);
        System.out.println(Cereals.GULDKORN.price);
    }
}
