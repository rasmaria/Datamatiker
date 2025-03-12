package Basic;

public class HejMethodMulighed {
    //Lav en klasse der hedder Basic.Hilsen.
//Lav en main-metode som du plejer, men lad den være tom i første omgang.
    public static void main(String[] args) {
hilsen();
    }

    //Skriv en metode der hedder hej. Vær opmærksom på at skrive metoden UDEN for main-metoden (men inden i klassen).
    //Metoden hej skal tage en String som parameter, som repræsenter navnet på den der skal siges hej til.
    public static void hilsen() {
        System.out.println("Hej ");
        navn();

    }

    public static void navn() {
        System.out.println("Signe ");
    }



}







//Det skal være en statisk metode, dvs. at den skal have keywordet static i sin metodesignatur.

// Parametre i parameterlisten har altid en type og et variabelnavn (her kunne variabelnavnet fx være name).
//Metoden skal ikke returnere noget (dvs returtypen er void).
//Inde i metoden skal der være en System.out.println som skal udskrive Hej Signe!, hvis navnet man giver med som argument er ”Signe”.
//Prøv nu at kalde metoden hej inde fra main-metoden.
//Husk at give den en variabel af typen String med som argument.
//Det kan fx være navnet ”Poul”.  Idet main-metoden og vores hej-metode befinder sig i samme klasse
//kan vi bare uden videre kalde hej-metoden inde fra main, fx med statementet hej(”Bo”).
// NB: Husk at man ellers i de tilfælde hvor metoderne ikke er defineret i samme klasse kalder statiske metoder på klassen, dvs. klassenavnet som står med stort bogstav, dot-operatoren (altså et punktum), og så metodens navn. Under alle omstændigheder skal der altså IKKE laves et nyt objekt af typen Basic.Hilsen, for at kunne kalde metoden hej.
//Prøv både at lave en variabel af typen String som du tildeler en værdi (fx ”Anne”), og derefter giver med som argument, og at kalde metoden med en String direkte: hej(”Anne”);
//Kald hej-metoden flere gange inde fra main-metoden, med forskellige navne.
//Udkommenter derefter dine metodekald i main-metoden med //.
//Skriv metoden om så den i stedet for at have en System.out.println returnerer det du ellers ville have skrevet ud (som en String). Dvs metoden skal nu have returtypen String, et return-statement inden i, og i main-metoden skal du have en variabel der gemmer værdien som metodekaldet returnerer.
//Lav en System.out.println der skriver din hilsen ud, men denne gang i main-metoden.
//Oplysninger
//
//Udgivet 31. januar 2025 af Nynne Just Christoffersen