package Opgaver.PokemonJagt;

public class Main {
    public static void main(String[] args) {
        // Opret skoven og tilføj Pokémoner
        Forest forest = new Forest();
        Mountain mountain = new Mountain();
        forest.addPokemon(new Pokemon("Pikachu", "Electric", 10));
        forest.addPokemon(new Pokemon("Charmander", "Fire", 12));
        forest.addPokemon(new Pokemon("Squirtle", "Water", 8));
        forest.addPokemon(new Pokemon("Bulbasaur", "Grass", 7));
        mountain.addPokemon(new Pokemon("Pikachu", "Electric", 15));
        mountain.addPokemon(new Pokemon("Squirtle", "Water", 6));

        // Vis alle Pokémoner i skoven
        forest.showAllPokemon();
        mountain.showAllPokemon();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        System.out.println();

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemonForest(forest, "name", "Charmander");

        // Træneren søger efter en Pokémon baseret på type
        ash.searchForPokemonForest(forest, "type", "Water");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemonForest(forest, "name", "Mewtwo");

        //OPGAVER

        // Led efter Pikachu
        ash.searchForPokemonForest(forest, "name", "Pikachu");
        ash.searchForPokemonMountain(mountain, "name", "Pikachu");
        ash.searchForPokemonMountain(mountain, "name", "Charmander");

        //Led efter type
        ash.searchForPokemonForest(forest, "type", "Water");
        ash.searchForPokemonMountain(mountain, "type", "Water");

        //Tilføj nye Pokemoner

        forest.addPokemon(new Pokemon("Vulpix", "Fire", 7));
        mountain.addPokemon(new Pokemon("Oddish", "Grass", 8));

        // Vis alle Pokémoner i skoven
        forest.showAllPokemon();
        mountain.showAllPokemon();



    }
}
