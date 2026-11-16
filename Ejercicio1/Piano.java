public class Piano extends Instrumento {
    public Piano() {
        super("Piano");
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " suena: ¡Plin, plon! ¡Notas musicales desde las teclas!");
    }
}
