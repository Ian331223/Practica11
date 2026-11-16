public class Autobus extends VehiculoTransporte {
    private double combustibleActual;

    public Autobus(double combustibleActual) {
        super("Autobus");
        this.combustibleActual = combustibleActual;
    }

    @Override
    public void calcularConsumo(double km) {

        double consumoTotal = km * 20; 
        combustibleActual -= consumoTotal;
        System.out.println("[" + nombre + "] Recorrio " + km + " km (20% por km). Consumo total: " + consumoTotal + "%. Combustible restante: " + Math.max(0, combustibleActual) + "%");
    }
}
