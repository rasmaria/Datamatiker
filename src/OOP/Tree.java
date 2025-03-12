package OOP;

import java.awt.Color;

public class Tree {
    //Startede ud med ikke at have private som access modifyer
    private double heightM;
    private double trunkDiameterCM;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double heightM, double trunkDiameterCM, TreeType treeType) {
        this.heightM = heightM;
        this.trunkDiameterCM = trunkDiameterCM;
        this.treeType = treeType;


        //Encapsulation (efter at have gjort vores variabler private kan vi hente det gennem en public medtide som henter værdierne)
    }
    public double getHeightM() {
        return heightM;
    }
    public double getTrunkDiameterCM(){
        return trunkDiameterCM;
    }
    public void setTrunkDiameterCM(double trunkDiameterCM) {
        this.trunkDiameterCM = trunkDiameterCM;
    }


    public void grow() {
        this.heightM = this.heightM + 2;
        this.trunkDiameterCM = this.trunkDiameterCM + 5;
    }
    public static void announceTree(){
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }

   public void announceTallTree() {
        if (this.heightM > 50) {
            System.out.println("It's a tall " + this.treeType + " tree");
        }
    }

}
