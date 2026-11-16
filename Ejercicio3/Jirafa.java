public class Jirafa extends AnimalDelZoo {

    public Jirafa(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Jirafa";
    }

    @Override
    public String getDieta() {
        return "herbivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Mmmm... (zumbido grave)");
    }
}
