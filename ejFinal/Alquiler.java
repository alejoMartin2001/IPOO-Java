package ejFinal;

import java.sql.Date;

public abstract class Alquiler {
    private Cliente cliente;
    private Date fecha;

    public abstract float getMontoAlquiler();
    public abstract float getMontoVehiculo();
    public abstract int getTotalVehiculos();

    public Alquiler(Cliente cliente){
        this.cliente = cliente;
    }
    
    public Date getFecha(){
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
