package OOP;

class Cirkel {
    double radius;


    public Cirkel(double radius) {
        this.radius = radius;

    }
    public double cirkelAreal() {
        return ((this.radius * this.radius)* Math.PI);
    }

    public static void main(String[] args) {
        Cirkel a = new Cirkel(30);
        System.out.println(a.cirkelAreal());

    }
}
