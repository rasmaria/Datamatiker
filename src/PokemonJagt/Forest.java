package PokemonJagt;

import java.util.ArrayList;

public class Forest {
    private ArrayList<Pokemon> pokemonListForest = new ArrayList<>();

    public void addPokemon(Pokemon pokemon) {
        pokemonListForest.add(pokemon);
    }

    public void showAllPokemon() {
        System.out.println("\nPokémon i skoven:");
        for (Pokemon p : pokemonListForest) {
            System.out.println(p);
        }
    }

    public Pokemon searchPokemonByName(String name) {
        for (Pokemon p : pokemonListForest) {
            if (p.getName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public Pokemon searchPokemonByType(String type) {
        for (Pokemon p : pokemonListForest) {
            if (p.getType().equalsIgnoreCase(type)) {
                return p;
            }
        }
        return null;
    }
}
