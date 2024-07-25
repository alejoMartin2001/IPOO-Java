package ejFinal;

public class Autos extends Vehiculo{
    protected float seguro;
    
    public Autos(String marca,int modelo,float d,float alquiler, float seguro){
        super(marca, modelo, d, alquiler);
        this.seguro = seguro;
    }
    
    public float valorAlquiler(){
        return (getAlquiler() + getSeguro());
    }

    public float getSeguro() {
        return seguro;
    }

    public void setSeguro(float seguro) {
        this.seguro = seguro;
    }

    
}
