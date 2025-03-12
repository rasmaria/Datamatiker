package PokemonJagt;

import java.util.ArrayList;

public class Mountain {
    private ArrayList<Pokemon> pokemonListMountain = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        pokemonListMountain.add(pokemon);
    }

    public void showAllPokemon() {
        System.out.println("\nPokémon på bjerget:");
        for (Pokemon p : pokemonListMountain) {
            System.out.println(p);
        }
    }

    public Pokemon searchPokemonByName(String name) {
        for (Pokemon p : pokemonListMountain) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Pokemon searchPokemonByType(String type) {
        for (Pokemon p : pokemonListMountain) {
            if (p.getType().equalsIgnoreCase(type)) {
                return p;
            }
        }
        return null;
    }
}
