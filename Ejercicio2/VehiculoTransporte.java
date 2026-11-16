public abstract class VehiculoTransporte {
    protected String nombre;

    public VehiculoTransporte(String nombre) {
        this.nombre = nombre;
    }

    public abstract void calcularConsumo(double km);
}
