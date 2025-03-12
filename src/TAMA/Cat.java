package TAMA;

public class Cat extends Tamagotchi{

    private int indoorOutdoor;

    //CONSTRUCTOR

    public Cat(String name, int indoorOutdoor) {
        super(name);
        this.indoorOutdoor = indoorOutdoor;
    }
    // Getter and Setter for indoorOutdoor
    public int getIndoorOutdoor() {
        return indoorOutdoor;
    }

    public void setIndoorOutdoor(int indoorOutdoor) {
        this.indoorOutdoor = indoorOutdoor;
    }

    // Overriding howAreYou() method from Tamagotchi
    @Override
    public String howAreYou() {
        if (getMood() == 5 && getEnergy() == 5 && getHunger() == 5) {
            return "Miaaaavvv....Everything is puuuurfect!! \nMood: " + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
        }
        if (getMood() >= 0 && getMood() < 3 && getEnergy() >= 0 && getEnergy() < 3 && getHunger() >= 0 && getHunger() < 3) {
            return "MIAV!!! I'm not okay - take better care of me! \nMood: "  + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
        }
        if (getMood() >= 3 && getMood() <= 5 && getEnergy() >= 3 && getEnergy() <= 5 && getHunger() >= 3 && getHunger() <= 5) {
            return "Miaaaavvv....Everything is fine!! \nMood: " + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
        }

        // Use getter methods to get mood, energy, and hunger
        return "Mood: " + getMood() + ". Energy: " + getEnergy() + ". Hunger: " + getHunger();
    }
}
