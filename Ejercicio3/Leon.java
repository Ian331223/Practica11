public class Leon extends AnimalDelZoo {

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Leon";
    }

    @Override
    public String getDieta() {
        return "carnivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Roooar!");
    }
}
