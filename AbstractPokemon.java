public abstract class AbstractPokemon implements PokemonInterface{

    public PokeMon createPokemon(String name,int health,String type){
        return new PokeMon(name,health,type);

    }

    public void attackPokemon(PokeMon pokemon){

        pokemon.setHealth(pokemon.getHealth()-10);

    }

}