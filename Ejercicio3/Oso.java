public class Oso extends AnimalDelZoo {

    public Oso(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Oso";
    }

    @Override
    public String getDieta() {
        return "omnivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Grrrr!");
    }
}
