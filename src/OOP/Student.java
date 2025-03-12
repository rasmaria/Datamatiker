package OOP;

public class Student {
    //1.	Opret en klasse kaldet Student, som skal have:
//o	En privat String variabel til studentens navn.
//o	En privat int variabel til studentens alder.
//o	En privat String variabel til studentens favorit computerspil.
//2.	Gør instansvariablerne private, så de kun kan tilgås via metoder.
//o	Dette sikrer indkapsling (encapsulation) og forhindrer direkte ændring af data.
    private String name;
    private int age;
    private String favoriteGame;

    //3.	Tilføj en konstruktør, der initialiserer disse attributter.
    public Student(String name, int age, String favoriteGame) {
        this.name = name;
        this.age = age;
        this.favoriteGame = favoriteGame;
    }
    //4. Tilføj public getter-metoder for hver attribut, så værdierne kan tilgås.

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }
    //5.	Tilføj public setter-metoder for at opdatere studentens oplysninger.

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 0 && age < 99) {
            this.age = age;
        }
        else {
            System.out.println("Age not valid");
        }
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }
    //5.	Tilføj public setter-metoder for at opdatere studentens oplysninger.

    public void announceStudent() {
        System.out.println("Student name: " + this.name);
        System.out.println("Student age: " + this.age);
        System.out.println("Student's favorite game: " + this.favoriteGame);
    }
}



//1.	Opret en klasse kaldet Student, som skal have:
//o	En privat String variabel til studentens navn.
//o	En privat int variabel til studentens alder.
//o	En privat String variabel til studentens favorit computerspil.
//2.	Gør instansvariablerne private, så de kun kan tilgås via metoder.
//o	Dette sikrer indkapsling (encapsulation) og forhindrer direkte ændring af data.
//3.	Tilføj en konstruktør, der initialiserer disse attributter.
//4.	Tilføj public getter-metoder for hver attribut, så værdierne kan tilgås.
//5.	Tilføj public setter-metoder for at opdatere studentens oplysninger.
//o	Settere beskytter data ved at tillade validering, fx sikre at alder ikke er negativ.
//6.	Opret en public metode visStudent(), der viser oplysninger om studenten.
//7.	Opret en main metode i en separat fil, der:
//o	Opretter et Student-objekt.
//o	Bruger getter-metoderne til at udskrive de oprindelige værdier.
//o	Bruger setter-metoderne til at opdatere studentens alder og favorit videospil.
//o	Udskriver de opdaterede værdier.