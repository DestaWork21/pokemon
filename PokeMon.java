public class PokeMon {
    private String name = " ";
    private String type = " ";
    private int health = 0; 
    private static int numPokemon = 0; 

    public PokeMon(){
        numPokemon ++;
    }



    public PokeMon(String name,int health,String type){

        this.name = name;
        this.health = health;
        this.type = type;
        numPokemon ++;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public static int getNumPokemon(){
        System.out.println("\n Total Pokemon: "+numPokemon); return numPokemon;
    }

}
