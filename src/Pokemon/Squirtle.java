package Pokemon;
public class Squirtle extends Pokemon implements InterfazPokemonAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje(){
        System.out.println("Hola soy Squirtle y este es mi Ataque Placaje");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi Ataque Arañazo");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y este es mi Ataque Mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirtle y este es mi Ataque HidroBomba");
    }
    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi Ataque de Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi Ataque Pistola de Agua");
    }
}
