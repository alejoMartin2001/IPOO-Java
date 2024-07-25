package ejFinal;
import ejFinal.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class EmpresaAlquiler{

    private String nombre;
    private String direccion;
    private int limite;
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public EmpresaAlquiler(String nombre,String direccion,int limite){
        this.nombre = nombre;
        this.direccion = direccion;
        this.limite = limite;
    }

    public void registrarAlquiler(Cliente c, Vehiculo v){
        c = new Cliente("Alejo","43459400","20434594007");
        v = new Autos("Honda", 1,45,99,4);
        Alquiler alquiler = new SimpleAlquiler(c,v);
        addAlquiler(alquiler);
    }

    public void registrarAlquileres(Cliente c, List<Vehiculo> v){
        c = new Cliente("Marcos","43459500","20434595007");
        v = new ArrayList<Vehiculo>();
        Vehiculo v1 = new Autos("Honda", 3,45,1199,400);
        Vehiculo v2 = new Autos("Toyota", 22,45,14799,4000);
        v.add(v2);
        v.add(v1);
        setAlquileres(alquileres);
    }


    public float montoAlquilerDe(Alquiler alquiler){
        return alquiler.getMontoAlquiler();
    }

    public float montoAlquileres(){
        float totalMonto = 0;
        for(Alquiler a: alquileres){
            totalMonto += a.getMontoAlquiler();
        }
        return totalMonto;
    }


    public void addAlquiler(Alquiler a){
        alquileres.add(a);
    }

    public void removeAlquiler(Alquiler a){
        alquileres.remove(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    } 

}