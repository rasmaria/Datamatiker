package OOP;

public class TreeMain {
    public static void main(String[] args) {
       Tree treeOne = new Tree(60, 40, TreeType.OAK);
       Tree treeTwo = new Tree(30, 20, TreeType.BIRCH);

       // Kan ikke bruge dem her længere efter vi gjorde variablerne private
//        System.out.println(treeOne.treeType);
//        System.out.println(treeOne.heightM);
//        System.out.println(treeOne.trunkDiameterCM);

        System.out.println(treeOne.getHeightM());
        System.out.println(treeOne.getTrunkDiameterCM());


        treeOne.announceTallTree();
        treeTwo.announceTallTree();
        System.out.println(Tree.TRUNK_COLOR);
        Tree.announceTree();



        //Dette er nu skrevet i main, så vi i stedet for bare kan skrive fx treeOne.announceTallTree();
// Kan ikke bruge dette længere efter vi har ændret til private.
//        if (treeOne.heightM > 50) {
//            System.out.println("It's a tall " + treeOne.treeType + " tree");
//        }
//        if (treeTwo.heightM > 50) {
//            System.out.println("It's a tall " + treeTwo.treeType + " tree");
//        }

    }
}
