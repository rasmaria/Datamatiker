package Opgaver.TAMA;

public class Tamagotchi {
    private String name;
    protected int age = 0;
    protected int mood = 0;
    protected int energy = 5;
    protected int hunger = 0;

    //CONSTRUCTOR

    public Tamagotchi(String name) {
        this.name = name;
    }

    //GETTERS
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public int getMood() {
        return mood;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    //SETTERS

    public void setName(String name) {
        this.name = name;
    }

    //METHODS

    //PLAY
    public String play() {
        if (this.mood < 5) {
            this.mood++;

            // If mood is 2 or 4, the energy will decrease by 1
            if (this.mood == 2 || this.mood == 4) {
                this.energy--;
                return this.name + " is playing! Mood is now at level " + this.mood + ". Energy decreased!";
            }
            return this.name + " is playing! Mood is now at level " + this.mood + ".";
        }
        return this.name + " is happy and doesn't want to play anymore.";
        }

        //SLEEP
        public String sleep() {
            if (this.energy < 5) {
                this.energy = this.energy + 2;
                this.hunger--;
                return this.name + " is sleeping! Energy is now at level " + this.energy + ". Hunger has decreased!";
            }
            return this.name + " isn't tired and doesn't need to sleep.";
        }
        //NAP
        public String nap() {
            if (this.energy < 5) {
                this.energy++;
                this.mood--;
                return this.name + " Took a nap! Energy is now at level " + this.energy + ". That make made " + this.name + " cranky. Mood has decreased!";
            }
            return this.name + " isn't tired and doesn't need to sleep.";
        }

        //FEED
        public String feed() {
            if (this.hunger < 5) {
                this.hunger++;
                return this.name + " is eating! Hunger is now at level " + this.hunger + ".";
            }
            return this.name + " isn't hungry right now.";
        }

        //BIRTHDAY
        public String birthday() {
        this.age++;
        return "Happy birthday - you are now " + this.age + " years old!";
        }


    public String howAreYou() {
        if (getMood() >= 0 && getMood() < 3 && getEnergy() >= 0 && getEnergy() < 3 && getHunger() >= 0 && getHunger() < 3) {
            return "I'm not okay - take better care of me!";
        }

        if (getMood() >= 3 && getMood() < 5 && getEnergy() >= 3 && getEnergy() < 5 && getHunger() >= 3 && getHunger() < 5) {
            return "Everything is fine!!";
        }

        if (getMood() == 5 && getEnergy() == 5 && getHunger() == 5) {
            return "All is perfect!!";
        }
        return "Mood: " + getMood() + ". Energy: " + getEnergy() + ". Hunger: " + getHunger();

    }
}

