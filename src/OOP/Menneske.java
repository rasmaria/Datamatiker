package OOP;

//1.	Skriv en Menneske-klasse. Et menneske kan have en ægtefælle.
// Det vil sige at der skal være en instans-variabel af typen Menneske
// (men at denne evt. kan være tom hvis mennesket ikke har en ægtefælle).
public class Menneske {
    String personName;
    Menneske spouse;
    boolean married;

    //Constructor

    public Menneske(String personName) {
        this.personName = personName;
        this.spouse = null;
        this.married = false;
    }

    //Getter for spouse

    public Menneske getSpouse() {
        return spouse;
    }
    //Getter for person navn
    public String getPersonName() {
        return personName;
    }

    //Setter for spouse
    public void setSpouse(Menneske spouse) {
        this.spouse = spouse;
    }


    public void gifterSigMed(Menneske nyPerson) {
        if (nyPerson == this) {
            System.out.println("You can't marry yourself!");
            married = false;
            return;
        }
        if (this.spouse != null) {
            System.out.println(this.personName + " is already married.");
            return;
        }

        this.spouse = nyPerson;
        nyPerson.setSpouse(this);
        married = true;
        System.out.println(this.personName + " and " + nyPerson.getPersonName() + " are now married.");
    }
    //Lav en metode der hedder bliverSkilt som sætter ægtefælle-instansvariablen til null
    public void bliveSkilt() {
       if (this.spouse == null) {
           System.out.println(this.personName + " can't be divorced from nobody");
       }
        Menneske exSpouse = this.spouse;
        this.spouse = null;
        this.married = false;

        // Also set the spouse's spouse to null
        exSpouse.setSpouse(null);
        exSpouse.married = false;

        System.out.println(this.personName + " and " + exSpouse.getPersonName() + " are now divorced.");
    }
}




//
//1.	Skriv en Menneske-klasse. Et menneske kan have en ægtefælle.
// Det vil sige at der skal være en instans-variabel af typen Menneske (men at denne evt. kan være tom hvis mennesket ikke har en ægtefælle).
//2.	Lav en metode i Menneske der hedder gifterSigMed, som tager et andet Menneske-objekt (det skal ikke være muligt at gifte sig med sig selv).
// Sørg for at når et Menneske gifter sig med et andet mennske bliver dette menneske samtidig det andet menneskes ægtefælle (sørg for at have en setter og getter-metoder til ægtefælle-attributten).
// HINT: man kan give et objekt med i et metodekald, og man kan give “sig selv” med som objekt ved at bruge this som parameter i stedet for en objektreference.
// NB: det er nemt at komme til at lave et uendeligt loop når metoderne kalder hinanden.
//3.	Lav en metode der hedder bliverSkilt som sætter ægtefælle-instansvariablen til null, og sørger for at den man er gift med også bliver skilt fra én.