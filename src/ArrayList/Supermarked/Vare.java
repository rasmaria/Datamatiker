package ArrayList.Supermarked;

public class Vare {
    private String type;
    private Double pris;

    public Vare(String type, Double pris) {
        this.type = type;
        this.pris = pris;
    }

    public String getType() {
        return type;
    }

    public Double getPris() {
        return pris;
    }

    @Override
    public String toString() {
        return type + " koster " + pris + "kr. pr. stk ";
    }
}
