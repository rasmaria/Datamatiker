package OOP;

public class NewStudent {
    public static void main(String[] args) {
        //o	Opretter et Student-objekt.
        //o	Bruger getter-metoderne til at udskrive de oprindelige værdier.
        Student student1 = new Student("Maria", 30, "Sims");
        System.out.println("Original info");
        student1.announceStudent();

        //o	Bruger setter-metoderne til at opdatere studentens alder og favorit videospil.
        student1.setAge(100);
        student1.setFavoriteGame("Roller Coaster Tycoon");

        System.out.println();

        //o	Udskriver de opdaterede værdier.

        System.out.println("Updated info");
        student1.announceStudent();

    }
}
//7.	Opret en main metode i en separat fil, der:
//o	Opretter et Student-objekt.
//o	Bruger getter-metoderne til at udskrive de oprindelige værdier.
//o	Bruger setter-metoderne til at opdatere studentens alder og favorit videospil.
//o	Udskriver de opdaterede værdier.