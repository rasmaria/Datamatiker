package Enum;

public enum Weekdays {
    Monday(1),
    Tuesday(2),
    Wednesday(3),
    Thursday(4),
    Friday(5),
    Saturday(6),
    Sunday(7);

    private int number;

    Weekdays(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
