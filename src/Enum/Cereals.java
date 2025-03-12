package Enum;

public enum Cereals {
    COCO_PUFFS(100, 2.90),
    GULDKORN(50, 3.4),
    CHEERIOS(20, 4.15),
    FRUIT_LOOPS(30, 3.1);

    //FINAL låser værdien så den ikke kan ændres

    final int levelOfTaste;
    final double price;

    Cereals (int levelOfTaste, double price) {
        this.levelOfTaste = levelOfTaste;
        this.price = price;
    }
}
