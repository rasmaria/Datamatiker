package OOP.BIKES;

public class BikesMain {
    public static void main(String[] args) {
        Cyklist john = new Cyklist("John");
        LadCykel first = new LadCykel("Blue", 4, 12000, 30, 1);
        Cyklist heidi = new Cyklist("Heidi");
        Cyklist barn = new Cyklist("barn");
        UniBike firstUni = new UniBike("Blue", 9, 3500, 15);


        first.enCyklistSaetterSig(john);
        System.out.println(first);

        System.out.println();

        first.hvemKoererLadcyklen();

        System.out.println();

        first.enCyklistSaetterSig(heidi);
        System.out.println(first);

        System.out.println();

        System.out.println(firstUni);




    }


}
