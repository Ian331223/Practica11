public class MainInstrumentos {
    public static void main(String[] args) {
        Instrumento[] instrumentos = {
            new Guitarra(),
            new Piano(),
            new Bateria()
        };

        System.out.println("SONIDOS DE INSTRUMENTOS\n");
        for (Instrumento inst : instrumentos) {
            inst.hacerSonido();
        }
    }
}
