public interface PokemonInterface{

    PokeMon createPokemon(String name,int health,String type);

    void attackPokemon(PokeMon pokemon);

    void pokemonInfo(PokeMon pokemon);

}