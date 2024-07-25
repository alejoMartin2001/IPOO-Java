package ejFinal;

import java.util.ArrayList;
import java.util.List;

public class FlotaAlquiler extends Alquiler{
    private List<Vehiculo> vehiculos = new ArrayList<Vehiculo> ();

    public FlotaAlquiler(Cliente cliente,List<Vehiculo>vehiculos){
        super(cliente);
        this.vehiculos = vehiculos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void addVehiculo(Vehiculo unVehiculo){
        vehiculos.add(unVehiculo);
    }
    
    public void removeVehiculo(Vehiculo unVehiculo){
        vehiculos.remove(unVehiculo);
    }

    public float getMontoAlquiler(){
        float totalAlquiler = 0;
        for(Vehiculo v:vehiculos){
            totalAlquiler += v.getAlquiler();
        }
        return totalAlquiler;
    }

    public float getMontoVehiculo(){
        float totalVehiculo = 0;
        for(Vehiculo v:vehiculos){
            totalVehiculo += v.getAlquiler();
        }
        return totalVehiculo;
    }

    public int getTotalVehiculos(){
        return vehiculos.size();
    }

}