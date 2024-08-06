package Set;

public class Cuadrado extends Figuras{
    private double lado;

    public Cuadrado(double lado){
        this.setLado(lado);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
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
        return getLado() * getLado(); //siempre get, porque no pueden acceder a nuestros atributos
    }


    
}

