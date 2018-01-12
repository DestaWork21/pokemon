public class Pokedex extends AbstractPokemon{

    public void pokemonInfo(PokeMon pokemon){

        System.out.println(

            "Name: "+pokemon.getName()+"\n"+

            "Health: "+pokemon.getHealth()+"\n"+

            "Type: "+pokemon.getType()+"\n"

        );

    }

}