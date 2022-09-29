package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;

    public Automovil(){
        this(null,null,0,0,null,0);
    }

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        Vehiculo.cantAutomovil++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }


    

    
}