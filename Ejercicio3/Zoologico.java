import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private ArrayList<Animal> animales;

    public Zoologico(String nombre) {
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public void agregar(Animal a) {
        animales.add(a);
    }

    public boolean eliminar(String nombreAnimal) {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getNombre().equalsIgnoreCase(nombreAnimal)) {
                Animal a = animales.remove(i);
                System.out.println("  Sale del zoologico: " + a.getNombre()
                    + " (" + a.getEspecie() + ")");
                return true;
            }
        }
        System.out.println("  [Error] no existe ningun animal llamado " + nombreAnimal);
        return false;
    }

    public Animal buscar(String nombreAnimal) {
        for (Animal a : animales) {
            if (a.getNombre().equalsIgnoreCase(nombreAnimal)) {
                return a;
            }
        }
        return null;
    }

    public int total() {
        return animales.size();
    }

    public int contarEspecie(String especie) {
        int cuenta = 0;
        for (Animal a : animales) {
            if (a.getEspecie().equals(especie)) {
                cuenta++;
            }
        }
        return cuenta;
    }

    public ArrayList<Animal> filtrarPorDieta(String dieta) {
        ArrayList<Animal> resultado = new ArrayList<>();
        for (Animal a : animales) {
            if (a.getDieta().equals(dieta)) {
                resultado.add(a);
            }
        }
        return resultado;
    }

    public void mostrarResumen(String[] especies) {
        System.out.println("Zoologico " + nombre + ": " + total() + " animales");
        for (String e : especies) {
            System.out.printf("  %-9s x %d%n", e, contarEspecie(e));
        }
    }

    public void mostrarTodos() {
        for (Animal a : animales) {
            System.out.println("  " + a);
        }
    }

    public void alimentar(String dieta) {
        for (Animal a : animales) {
            if (a.getDieta().equals(dieta)) {
                a.comer();
            }
        }
    }

    public void escucharUnoDeCadaEspecie(String[] especies) {
        for (String e : especies) {
            for (Animal a : animales) {
                if (a.getEspecie().equals(e)) {
                    a.hacerSonido();
                    break;
                }
            }
        }
    }
}
