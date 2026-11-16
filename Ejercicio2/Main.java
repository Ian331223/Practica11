import java.util.ArrayList;
import java.util.List;

public class MainTransporte {
    public static void main(String[] args) {

        List<VehiculoTransporte> flota = new ArrayList<>();

        flota.add(new Automovil(500.0));
        flota.add(new Autobus(1000.0));
        flota.add(new CamionDeCarga(800.0, 0.0));
        flota.add(new CamionDeCarga(800.0, 75.0));
        flota.add(new CamionDeCarga(800.0, 250.0));

        double kilometrosRecorridos = 5.0;

        System.out.println("CALCULANDO CONSUMO DE COMBUSTIBLE\n");

        for (VehiculoTransporte vehiculo : flota) {
            vehiculo.calcularConsumo(kilometrosRecorridos);
        }
    }
}
