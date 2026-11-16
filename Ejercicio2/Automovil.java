public class Automovil extends VehiculoTransporte {
    private double combustibleActual;

    public Automovil(double combustibleActual) {
        super("Automovil");
        this.combustibleActual = combustibleActual;
    }

    @Override
    public void calcularConsumo(double km) {

        double consumoTotal = km * 10; 
        combustibleActual -= consumoTotal;
        System.out.println("[" + nombre + "] Recorrio " + km + " km (10% por km). Consumo total: " + consumoTotal + "%. Combustible restante: " + Math.max(0, combustibleActual) + "%");
    }
}
