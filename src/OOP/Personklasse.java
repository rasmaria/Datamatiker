package OOP;

import java.util.SortedMap;

//Class
class Personklasse {
    String firstName;
    String lastName;
    String middleName;
    int age;

    //Constructor
    public Personklasse(String firstName, String middleName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;

    }
    //Method to returns values
    public String PersonklasseInfo() {
        return "The persons name is " + firstName + " " + middleName + " " + lastName + " and is " + age + " years old.";
    }

    public static void main(String[] args) {
        Personklasse maria = new Personklasse("Maria", "Fogt", "Rasmussen", 30);
        Personklasse karsten = new Personklasse("Karsten", "", "Jensen", 67);
        System.out.println(maria.PersonklasseInfo());
        System.out.println(karsten.PersonklasseInfo());


    }
}
