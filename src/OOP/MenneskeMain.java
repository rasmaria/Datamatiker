package OOP;

public class MenneskeMain {
    public static void main(String[] args) {
        Menneske person1 = new Menneske("Alice");
        Menneske person2 = new Menneske("Bob");
        Menneske person3 = new Menneske("Charlie");

        // Alice og Bob gifter sig
        person1.gifterSigMed(person2);

        // Forsøg at gifte sig med sig selv (Alice prøver at gifte sig med Alice)
        person1.gifterSigMed(person1); // Dette vil give en fejl

        // Alice prøver at gifte sig med Charlie, men er allerede gift med Bob
        person1.gifterSigMed(person3); // Dette vil give en fejl

        // Bob og Alice bliver skilt
        person1.bliveSkilt();
    }
}

