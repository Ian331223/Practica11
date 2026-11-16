public class Bateria extends Instrumento {
    public Bateria() {
        super("Batería");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " suena: ¡Dum, tss! ¡Ritmo de percusion!");
    }
}
