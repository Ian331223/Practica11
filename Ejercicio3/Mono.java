public class Mono extends AnimalDelZoo {

    public Mono(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Mono";
    }

    @Override
    public String getDieta() {
        return "omnivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Uh uh ah ah!");
    }
}
