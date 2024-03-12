package Pokemon;

public class Bulbasaur extends Pokemon implements InterfazPokemonPlanta {

    public Bulbasaur() {
    }


    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi Ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi Ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi Ataque Mordisco");
    }
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi Ataque Drenaje");
    }
    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi Ataque Paralizar");
    }
}
