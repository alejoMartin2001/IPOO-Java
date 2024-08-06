package Mapa;

public class CodigoLlave implements Comparable<CodigoLlave>{
    private int codigo;

    public CodigoLlave(int codigo){
        this.setCodigo(codigo);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int compareTo(CodigoLlave other){
        return Integer.compare(this.getCodigo(),other.getCodigo());
    }
    @Override
    public String toString() {
        return "CodigoLlave{" + "codigo=" + codigo + '}';
    }
}
