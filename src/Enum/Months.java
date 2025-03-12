package Enum;

public enum Months {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTMEBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private int number;

    Months(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }


}
