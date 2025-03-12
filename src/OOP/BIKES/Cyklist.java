package OOP.BIKES;

//3.	Lav en meget simpel klasse der hedder Cyklist. En Cyklist har et navn som bliver sat i konstruktøren.

public class Cyklist {
    String name;

    public Cyklist(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
}
