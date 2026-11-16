public class Loro extends AnimalDelZoo {

    public Loro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Loro";
    }

    @Override
    public String getDieta() {
        return "herbivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Hola, hola!");
    }
}
