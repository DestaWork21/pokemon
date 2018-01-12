public class PokemonTest{

    public static void main(String[] args){

        Pokedex pokedex = new Pokedex();

        PokeMon sq   = pokedex.createPokemon("squir",95,"water");

        PokeMon charm = pokedex.createPokemon("charmander",85,"fire");

        PokeMon bulbas  = pokedex.createPokemon("bulbasaur",99,"grass");
 

        pokedex.pokemonInfo(sq);

        pokedex.attackPokemon(sq);

        pokedex.pokemonInfo(sq);


        PokeMon.getNumPokemon();

    }

}