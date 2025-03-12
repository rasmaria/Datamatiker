package Lampe;

public class RoomLampe {
    public static void main(String[] args) {

        Lampe kitchenLamp = new Lampe(true);
        Lampe basementLamp = new Lampe();

    boolean kitchen = kitchenLamp.isOn();
    boolean basement = basementLamp.isOn();
    System.out.println("Kitchen lamp is " + (kitchen ? "on" : "off"));
    System.out.println("Basement lamp is " + (basement ? "on" : "off"));

        kitchenLamp.trykPåKontakten();
        basementLamp.trykPåKontakten();

        System.out.println("Kitchen lamp is now " + (kitchenLamp.getStatus()));
        System.out.println("Basement lamp is now " + (basementLamp.getStatus()));
}

}
