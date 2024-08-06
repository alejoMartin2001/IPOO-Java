package Set;
import java.lang.Math;

public class Circulo extends Figuras{
    protected double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public void mover(int value, Direccion d){
        Punto p = new Punto();
        if(d.getValor() == 1 || d.getValor() == 2){
            p.setY(value);
        }else{
            p.setX(value);
        }
    }
    
    public double area(){
        return Math.PI * Math.pow(getRadio(),2); //siempre get, porque no pueden acceder a nuestros atributos
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
