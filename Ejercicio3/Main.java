import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("NeonZoo");
        String[] especies = {"Leon", "Elefante", "Mono", "Pinguino",
                             "Jirafa", "Loro", "Cebra", "Oso"};

        String[] nombres = {"Simba", "Dumbo", "Abu", "Pingu", "Melman", "Kiko", "Marty", "Baloo",
                            "Nala", "Tantor", "Coco", "Skipper", "Sofi", "Paco", "Rayas", "Yogi",
                            "Mufasa", "Ellie", "Bongo", "Rico", "Zara", "Lola", "Estrella", "Rocky",
                            "Kira", "Toby", "Taro", "Kowalski", "Luna", "Pepe", "Nube", "Bruno"};

        System.out.println("----- Llegada de animales -----");
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            int edad = 2 + (i * 7) % 15;
            String especie = especies[i % especies.length];
            Animal nuevo;
            if (especie.equals("Leon")) nuevo = new Leon(nombre, edad);
            else if (especie.equals("Elefante")) nuevo = new Elefante(nombre, edad);
            else if (especie.equals("Mono")) nuevo = new Mono(nombre, edad);
            else if (especie.equals("Pinguino")) nuevo = new Pinguino(nombre, edad);
            else if (especie.equals("Jirafa")) nuevo = new Jirafa(nombre, edad);
            else if (especie.equals("Loro")) nuevo = new Loro(nombre, edad);
            else if (especie.equals("Cebra")) nuevo = new Cebra(nombre, edad);
            else nuevo = new Oso(nombre, edad);
            zoo.agregar(nuevo);
        }
        zoo.mostrarResumen(especies);

        System.out.println("----- Un sonido de cada especie -----");
        zoo.escucharUnoDeCadaEspecie(especies);

        System.out.println("----- Hora de comer: carnivoros -----");
        zoo.alimentar("carnivora");

        System.out.println("----- Traslados a otro zoologico -----");
        zoo.eliminar("Dumbo");
        zoo.eliminar("Skipper");
        zoo.eliminar("Godzilla");

        System.out.println("----- Nuevos ingresos -----");
        zoo.agregar(new Leon("Scar", 9));
        zoo.agregar(new Pinguino("Cabo Jr", 1));
        System.out.println("  Ingresan Scar (Leon) y Cabo Jr (Pinguino)");

        System.out.println("----- Busqueda -----");
        Animal encontrado = zoo.buscar("baloo");
        if (encontrado != null) {
            System.out.println("  Encontrado: " + encontrado);
            encontrado.hacerSonido();
        }

        System.out.println("----- Herbivoros -----");
        ArrayList<Animal> herbivoros = zoo.filtrarPorDieta("herbivora");
        for (Animal a : herbivoros) {
            System.out.println("  " + a);
        }

        System.out.println("----- Resumen final -----");
        zoo.mostrarResumen(especies);
    }
}
