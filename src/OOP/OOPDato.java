package OOP;

//•	Skriv en klassedefinition for Date, en objekttype, der indeholder tre heltal: year, month og day.
public class OOPDato {
    int year;
    int month;
    int day;

    //•	Denne klasse skal give to konstruktører. Den første bør ikke tage nogen parametre og initialisere en default date.
    public OOPDato() {
        year = 0;
        month = 0;
        day = 0;
    }


    //•	Den anden skal tage parametre  year, month og day og bruge dem til at initialisere instansvariablerne.
    public OOPDato(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void announceBirthday() {
        System.out.println("You were born in the year: " + this.year);
        System.out.println("You were born in the month of: " + this.month);
        System.out.println("You were born on the: " + this.day);
    }



    public static void main(String[] args) {
        OOPDato birthdayMaria = new OOPDato(1994, 10, 26);
        OOPDato birthdayAnders = new OOPDato();
        birthdayMaria.announceBirthday();
        birthdayAnders.announceBirthday();
    }
}


//Dato
//
//•	Skriv en klassedefinition for Date, en objekttype, der indeholder tre heltal: year, month og day.
//•	Denne klasse skal give to konstruktører. Den første bør ikke tage nogen parametre og initialisere en default date.
//•	Den anden skal tage parametre  year, month og day og bruge dem til at initialisere instansvariablerne.
//•	Skriv en main metode, der opretter et nyt Date objekt ved navn birthday. Det nye objekt skal indeholde din fødselsdato. Du kan bruge begge konstruktører.