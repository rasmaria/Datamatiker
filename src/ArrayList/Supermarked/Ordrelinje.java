package ArrayList.Supermarked;

public class Ordrelinje {
    private Vare vare;
    private int antal;

    public Ordrelinje(Vare vare, int antal) {
        this.vare = vare;
        this.antal = antal;
    }

    public Double prisAntal() {
        return vare.getPris() * antal;
    }
    @Override
    public String toString(){
        return antal + " x " + vare.getType() + " til prisen " + vare.getPris() + " kr. koster samlet set = " + prisAntal() + " kr.";
    }
}
