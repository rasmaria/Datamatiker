package Opgaver.Lampe;

public class Lampe {
    private boolean isOn;

    public Lampe(boolean isOn) {
        this.isOn = isOn;
    }

    public Lampe() {
        this.isOn = false;
    }
public boolean isOn() {
    return isOn;
}

    public void trykPåKontakten() {
        this.isOn = !this.isOn;
    }

    //For at skrive True/False om til on/off i stedet
    public String getStatus() {
        return isOn ? "on" : "off";
    }

}


//Skriv en klasse der hedder Opgaver.Lampe.Opgaver.Lampe.
//En lampe har en boolean instansvariabel der angiver om den er tændt eller slukket.
//Når man laver et nyt lampe-objekt skal der være en konstruktør hvor man kan vælge om lampen som udgangspunkt er tændt eller slukket,
//samt en tom konstruktør hvor lampen som udgangspunkt er slukket (dette kaldes ”overload” af konstruktøren).
//Skriv en metode der hedder trykPåKontakt, som tænder lampen hvis den er slukket, og slukker lampen hvis den er tændt.
//Lav en klasse (du kan fx kalde den Værelse) med en main-metode hvor du instantierer forskellige lampeobjekter
//(kald variablerne for skrivebordslampe, sengelampe el. lign.) og tester om de virker som de skal.
//Lav en static variabel i Opgaver.Lampe.Opgaver.Lampe-klassen som tæller hvor mange lamper der er lavet.
//Den skal være private og have en static get-metode.
//Prøv at skrive ud inde i Værelse-klassens main-metode hvor mange lamper der er lavet i alt.
//Lav en toString-metode inde i Opgaver.Lampe.Opgaver.Lampe-klassen.
//Metoden skal returnere en String hvor der står “Lampen er slukket” eller “Lampen er tændt” alt efter om lampen er slukket eller tændt.