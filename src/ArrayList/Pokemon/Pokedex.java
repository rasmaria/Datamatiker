package ArrayList.Pokemon;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex {
    Scanner scanner = new Scanner(System.in);

    private ArrayList<Pokemon> pokedex;

    public Pokedex(){
        pokedex  = new ArrayList<>();
    }

    public void addPokemon(Pokemon p) {
        pokedex.add(p);

    }
    public void removePokemon(String name) {
        boolean found = false;
        for (Pokemon pokemons : pokedex) {
            if (pokemons.getName().equalsIgnoreCase(name)) {
                pokedex.remove(pokemons);
                continue;
            }
        }
    }

    public void showPokemons() {
        System.out.println("Here are your Pokemons:");
        for (Pokemon pokemons : pokedex) {
            System.out.println(pokedex);
            break;
        }
    }

}
