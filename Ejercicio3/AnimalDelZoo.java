public abstract class AnimalDelZoo implements Animal {
    private String nombre;
    private int edad;

    public AnimalDelZoo(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void comer() {
        System.out.println("  " + nombre + " (" + getEspecie() + ") come su racion "
            + getDieta());
    }

    @Override
    public String toString() {
        return String.format("%-10s | %-9s | %2d anios | %s",
            nombre, getEspecie(), edad, getDieta());
    }
}
