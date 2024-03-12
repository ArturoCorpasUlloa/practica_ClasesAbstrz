package Pokemon;

public class Charmander extends Pokemon implements InterfazPokemonFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi Ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi Ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi Ataque Mordisco");
    }
    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi Puño de Fuego");
    }
    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Hola soy Charmander y este es mi Ataque Lanza Llamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi Ataque Ascuas");
    }
}
