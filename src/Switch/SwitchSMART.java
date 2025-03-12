package Switch;

public class SwitchSMART {
    public static void main(String[] args) {

        //KLASSISK SWITCH

        String dayClassic = "Friday";
        String resultClassic = "";

        switch (dayClassic) {
            case "Saturday", "Sunday":
                System.out.println("10 am");
                break;
            case "Monday":
                System.out.println("8 am");
                break;
            default:
                System.out.println("7 am");
        }


        //FORKORTET SWITCH


        String day = "Sunday";
        String result = "";

        result = switch (day) {
            case "Saturday", "Sunday" -> "10 am";
            case "Monday" -> "8 am";
            default -> "7 am";
        };
        System.out.println(result);

        // YIELD I STEDET FOR ->


        String month = "October";
        String resultMonth = "";

        resultMonth = switch (month) {
            case "June", "July":
                yield "Summer vacation";
            case "December":
                yield "Christmas";
            default:
                yield "Great month!";
        };
        System.out.println(resultMonth);
    }
}
