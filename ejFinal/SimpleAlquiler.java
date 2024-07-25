package ejFinal;

public class SimpleAlquiler extends Alquiler{
    protected Vehiculo v;

    public SimpleAlquiler(Cliente cliente, Vehiculo v){
        super(cliente);
        this.v = v;
    }

    public float getMontoAlquiler(){
        return v.getAlquiler();
    }

    public float getMontoVehiculo(){
        return v.getPrecio();
    }

    public int getTotalVehiculos(){
        return 1;
    }

    public Vehiculo getV() {
        return v;
    }

    public void setV(Vehiculo v) {
        this.v = v;
    } 
}