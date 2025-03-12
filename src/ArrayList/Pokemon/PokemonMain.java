package ArrayList.Pokemon;

import java.util.Scanner;

public class PokemonMain {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pokedex pokedex = new Pokedex();

    Pokemon pikachu = new Pokemon("Pikachu", "Electric", 5);
    Pokemon charmander = new Pokemon("Charmander", "Fire", 8);
    Pokemon squirtle = new Pokemon("Squirtle", "Water", 7);

    pokedex.addPokemon(pikachu);
    pokedex.addPokemon(charmander);
    pokedex.addPokemon(squirtle);

    System.out.println("Hello! \nTheese are your Pokemons in your Pokedex: ");
    pokedex.showPokemons();

    Pokemon eve = new Pokemon("Eve", "Earth", 6);
    pokedex.addPokemon(eve);

    pokedex.showPokemons();

    pokedex.removePokemon("Squirtle");

    pokedex.showPokemons();



    }

}
