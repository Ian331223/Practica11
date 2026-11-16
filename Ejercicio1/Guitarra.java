public class Guitarra extends Instrumento {
    public Guitarra() {
        super("Guitarra");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " suena: ¡Strum! ¡Acordes de cuerdas metalicas!");
    }
}
