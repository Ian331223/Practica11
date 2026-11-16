public class Pinguino extends AnimalDelZoo {

    public Pinguino(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Pinguino";
    }

    @Override
    public String getDieta() {
        return "carnivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Cuac cuac!");
    }
}
