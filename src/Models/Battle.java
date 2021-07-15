package Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Battle {
    private Player actualPlayer;
    private Player winner;
    private Player player1;
    private Player player2;
    private int pokemonsPerPlayer = 3;
    private static ArrayList<Pokemon> pokemons = new ArrayList<>(Arrays.asList
            (new Pokemon("Pikachu", 100, 30, 10),
                    new Pokemon("Ditto", 70, 20, 10),
                    new Pokemon("Charmander", 80, 35, 20),
                    new Pokemon("Gengar", 60, 10, 5),
                    new Pokemon("Roselia", 75, 30, 15),
                    new Pokemon("Eevee", 50, 10, 10),
                    new Pokemon("Cleffa", 90, 40, 10),
                    new Pokemon("Magikarp", 55, 20, 5),
                    new Pokemon("Mawile", 90, 80, 10),
                    new Pokemon("Squirtle", 80, 20, 50),
                    new Pokemon("Bulbasaur", 120, 35, 50),
                    new Pokemon("Torchic", 70, 70, 5),
                    new Pokemon("Mudkip", 60, 30, 60),
                    new Pokemon("Treecko", 60, 50, 20),
                    new Pokemon("Raichu", 100, 32, 12),
                    new Pokemon("Charizard", 100, 35, 15),
                    new Pokemon("Mewtwo", 100, 36, 13),
                    new Pokemon("Mew", 100, 29, 9),
                    new Pokemon("Regigigas", 100, 80, 30),
                    new Pokemon("scizzor", 60, 50, 20),
                    new Pokemon("Zoroak", 50, 70, 10)));

    public static ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public static void setPokemons(ArrayList<Pokemon> pokemons) {
        Battle.pokemons = pokemons;
    }

    public static String getListPokes(){
        String result = "\n|Id |Name        |Health|Attack|Defense|\n"+
                "|---|------------|------|------|-------|\n";
        for (Pokemon pokemon:pokemons) {
            result += pokemon.toString();
        }
        return result;
    }
}
