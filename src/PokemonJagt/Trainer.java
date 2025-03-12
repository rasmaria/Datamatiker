package PokemonJagt;

public class Trainer {
    private String name;

    public Trainer(String name) {
        this.name = name;
    }

    public void searchForPokemonForest(Forest forest, String searchType, String value) {
        Pokemon foundPokemon = null;

        if (searchType.equalsIgnoreCase("name")) {
            foundPokemon = forest.searchPokemonByName(value);
        } else if (searchType.equalsIgnoreCase("type")) {
            foundPokemon = forest.searchPokemonByType(value);
        }

        if (foundPokemon != null) {
            System.out.println(name + " fandt en " + foundPokemon);
        } else {
            System.out.println(name + " kunne ikke finde en Pokémon med " + searchType + " '" + value + " i skoven.");
        }
    }

    public void searchForPokemonMountain(Mountain mountain, String searchType, String value) {
        Pokemon foundPokemon = null;

        if (searchType.equalsIgnoreCase("name")) {
            foundPokemon = mountain.searchPokemonByName(value);
        } else if (searchType.equalsIgnoreCase("type")) {
            foundPokemon = mountain.searchPokemonByType(value);
        }

        if (foundPokemon != null) {
            System.out.println(name + " fandt en " + foundPokemon);
        } else {
            System.out.println(name + " kunne ikke finde en Pokémon med " + searchType + " '" + value + " på bjerget.");
        }

    }
}
