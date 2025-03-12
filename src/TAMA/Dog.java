package TAMA;

public class Dog extends Tamagotchi{
    private int race;

    //CONSTRUCTOR

    public Dog(String name, int race) {
        super(name);
        this.race = race;
    }
    //Getter

    public int getRace() {
        return race;
    }
    //SETTER

    public void setRace(int race) {
        this.race = race;
    }

    // Overriding howAreYou() method from Tamagotchi
    @Override
    public String howAreYou() {
        if (getMood() == 5 && getEnergy() == 5 && getHunger() == 5) {
            return "**WAGGING TAIL**....Everything is wooffect!! \nMood: " + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
        }
        if (getMood() >= 0 && getMood() < 3 && getEnergy() >= 0 && getEnergy() < 3 && getHunger() >= 0 && getHunger() < 3) {
            return "WOOF!! I'm not okay - take better care of me! \nMood: " + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
        }

        if (getMood() >= 3 && getMood() <= 5 && getEnergy() >= 3 && getEnergy() <= 5 && getHunger() >= 3 && getHunger() <= 5) {
            return "**WAGGING TAIL**....Everything is fine!! \nMood: " + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
        }

        return "Mood: " + this.mood + ". Energy: " + this.energy + ". Hunger: " + this.hunger;
    }
}
