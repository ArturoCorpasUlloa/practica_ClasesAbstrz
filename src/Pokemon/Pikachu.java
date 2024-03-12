package Pokemon;

public class Pikachu extends Pokemon implements InterfazPokemonElectrico {

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi Ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi Ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi Ataque Mordisco");
    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y este es mi Ataque Impact Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi Ataque Puño de Fuego");
    }
}
