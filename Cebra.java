public class Cebra extends AnimalDelZoo {

    public Cebra(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Cebra";
    }

    @Override
    public String getDieta() {
        return "herbivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Hiiii-ja!");
    }
}
