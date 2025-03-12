package PokemonJagt;

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
        mountain.addPokemon(new Pokemon("Vulpix", "Fire", 8));


        // Vis alle Pokémoner i skoven
        forest.showAllPokemon();
        mountain.showAllPokemon();

        System.out.println();

        // Opret en træner
        Trainer ash = new Trainer("Ash");

        // Træneren søger efter en Pokémon baseret på navn
        ash.searchForPokemon(forest, "name", "Charmander");

        // Træneren søger efter en Pokémon baseret på type
        ash.searchForPokemon(forest, "type", "Water");

        // Prøver at søge efter en ikke-eksisterende Pokémon
        ash.searchForPokemon(forest, "name", "Mewtwo");




        //OPGAVE:

        //  1: Søg efter en ny pokemon efter navn:
        ash.searchForPokemon(forest, "name", "Pikachu");

        //  2: Søg efter en ny pokemon efter type:

        ash.searchForPokemon(forest, "type", "Fire");




        //  3: Tilføj en ny Pokémon til skoven
        forest.addPokemon(new Pokemon("Vulpix", "Fire", 6));

        //Tilføj ny pokemon til bjerget:
        mountain.addPokemon(new Pokemon("Squirtle", "Water", 6));

    }
}
