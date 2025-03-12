package ArrayList.Supermarked;

public class SupermarkedsWebshop {
    public static void main(String[] args) {
        Vare banan = new Vare("Banan", 3.25);
        Vare milk = new Vare("Milk", 16.25);
        Vare cola = new Vare("Cola", 15.95);

        System.out.println(banan.toString());
        System.out.println(milk.toString());
        System.out.println(cola.toString());



        Ordrelinje bananAntal = new Ordrelinje(banan, 8);
        Ordrelinje milkAntal = new Ordrelinje(milk, 2);
        Ordrelinje colaAntal = new Ordrelinje(cola, 4);

        System.out.println(bananAntal.toString());
        System.out.println(milkAntal.toString());
        System.out.println(colaAntal.toString());




    }
}



//Indkøbskurv
//
//Skriv følgende program for at modellere en indkøbskurv på en supermarkedswebshop:
//Der skal være en klasse kaldet  Vare som repræsenterer den ting man vil købe.
// Et vare har et navn og en pris, fx ”Mælk”, 7 kr.
// Skriv en anden klasse kaldet Ordrelinje som repræsenterer en kundes ønske
// om at købe en vare i et bestemt antal, fx 3 liter mælk.
// En Ordrelinje-klasse har altså en reference til et Vare-objekt.
// Ordrelinje-klassen skal indeholde en metode som returnerer prisen på varen i det angivne antal,
// fx koster 3 liter mælk 21 kr.
//Skriv en klasse med en main-metode hvorfra I kan teste de andre klasser løbende.
//Lav toString-metoder for Vare og Ordrelinje-klasserne.
//Skriv en klasse kaldet Indkøbskurv som gemmer Ordrelinjer  i en ArrayList.
// Der skal være en metode der gør at man kan tilføje Ordrelinjer til kurven
// uden at man selv tilføjer dem direkte til ArrayListen ude fra main-metoden (ArrayListen skal være private).
// Indkøbskurv-klassen skal også have en metode som angiver den samlede pris af alle varer i kurven,
// samt en toString-metode der returnerer en streng med alle varer og deres antal. '