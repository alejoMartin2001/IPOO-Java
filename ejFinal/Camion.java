package ejFinal;

public class Camion extends Vehiculo{

    public Camion(String marca,int modelo,float precio,float alquiler){
        super(marca, modelo, precio, alquiler);
    }
    
    public float valorAlquiler(){
        return (getAlquiler());
    }

}
