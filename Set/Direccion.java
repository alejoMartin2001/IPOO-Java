package Set;

enum Direccion {
    NORTE (1),SUR (2),ESTE (3),OESTE (4);
    
    private int valor;
    Direccion(int valor){
        this.valor = valor;
    }
    public int getValor() {
        return this.valor;
    }
  
}
