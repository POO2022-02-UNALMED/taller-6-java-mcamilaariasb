package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(){
        this(null,0, null, 0, 0, null, false);
    }

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        Vehiculo.cantCamioneta++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    
    
}
