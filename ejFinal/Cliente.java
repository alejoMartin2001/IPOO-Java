package ejFinal;

public class Cliente extends Persona{
    protected String CUIT;

    public Cliente(String nombre,String DNI,String CUIT){
        super(nombre,DNI);
        this.CUIT = CUIT;
    }

    public String getCUIT() {
        return CUIT;
    }

    public void setCUIT(String CUIT) {
        this.CUIT = CUIT;
    }

    
    
}
