package Mapa;

public class CaracterLlave {
    private String caracter;
    public CaracterLlave(String caracter) {
        this.setCaracter(caracter);
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }
    
    @Override
    public String toString() {
        return "CaracterLlave{" + "caracter='" + caracter + '\'' + '}';
    }
}
