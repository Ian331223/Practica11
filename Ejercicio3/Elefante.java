public class Elefante extends AnimalDelZoo {

    public Elefante(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String getEspecie() {
        return "Elefante";
    }

    @Override
    public String getDieta() {
        return "herbivora";
    }

    @Override
    public void hacerSonido() {
        System.out.println("  " + getNombre() + " (" + getEspecie() + "): Fuuuuu! (barrito)");
    }
}
