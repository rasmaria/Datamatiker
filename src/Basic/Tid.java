package Basic;

public class Tid {
    public static void main(String[] args) {

        int timer = 10;
        int minutter = 33;
        int sekunder = 15;
        System.out.println("Timer: " + timer);
        System.out.println("Minutter: " + minutter);
        System.out.println("Sekunder: " + sekunder);
        System.out.println("Klokken er: " + timer + "." + minutter + "." + sekunder);
        int sekunderIDøgnet = 60*60*24;
        System.out.println("Sekunder i Døgnet: " + sekunderIDøgnet);
        int sekunderDerErGåetSidenMidnat = (10*60*60) + (33*60) + 15;
        System.out.println("Sekunder Der er gået siden midnat indtil kl. 10.33.15: " + sekunderDerErGåetSidenMidnat);
        int sekunderIndtilMidnat = sekunderIDøgnet - sekunderDerErGåetSidenMidnat;
                System.out.println("Sekunder indtil midnat: " + sekunderIndtilMidnat);

        int slutTimer = 10;
        int slutMinutter = 53;
        int slutSekunder = 25;
        System.out.println("Opgaven blev færdig klokken: " + slutTimer + "." + slutMinutter + "." + slutSekunder);
        int sekunderDerErGåetSidenMidnatTilOpgaveFærdig = (10*60*60) + (53*60) + 25;
        int sekunderDetTogAtLøseOpgaven = sekunderDerErGåetSidenMidnatTilOpgaveFærdig - sekunderDerErGåetSidenMidnat;
                System.out.println("Sekunder det tog at færdiggøre opgaven: " + sekunderDetTogAtLøseOpgaven);
        double minutterForOpgaven = sekunderDetTogAtLøseOpgaven / 60;
        System.out.println("Basic.Tid det tog at løse opgaven: " + sekunderDetTogAtLøseOpgaven / 60 + " minutter" );
        System.out.println("Procentdel af en time hvis opgaven blev løst på 20 minutter = " + minutterForOpgaven / 60 * 100);


    }
}

