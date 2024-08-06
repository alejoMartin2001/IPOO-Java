package Mapa;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Mapa {
    private SortedMap<CodigoLlave, CaracterLlave> mapa = new TreeMap<>();

    public Mapa(SortedMap<CodigoLlave, CaracterLlave> mapa) {
        this.setMapass(mapa);;
    }

    public SortedMap<CodigoLlave, CaracterLlave> getMapass() {
        return mapa;
    }

    public void setMapass(SortedMap<CodigoLlave, CaracterLlave> mapa) {
        this.mapa = mapa;
    }

    public CodigoLlave codigoPrimerLlave() {
        return mapa.firstKey(); // retorna el primer objeto CodigoLlave
    }

    public void addClaveValor(CodigoLlave cod, CaracterLlave carac) {
        mapa.put(cod, carac); // agrego una clave y un valor
    }

    public void removeClaveValor(CodigoLlave cod) {
        mapa.remove(cod); // elimino un objeto con su clave o también se puede con la clave y su valor
    }

    public static void main(String[] args) {
        // Crear un TreeMap con un Comparator personalizado
        SortedMap<CodigoLlave, CaracterLlave> sortedMap = new TreeMap<>();

        CaracterLlave c = new CaracterLlave("Z");
        CodigoLlave co = new CodigoLlave(2);
        CaracterLlave c2 = new CaracterLlave("AA");
        CodigoLlave co2 = new CodigoLlave(0);
        CaracterLlave c1 = new CaracterLlave("ZJ");
        CodigoLlave co1 = new CodigoLlave(1);
        Mapa m = new Mapa(sortedMap);
        m.addClaveValor(co, c);
        m.addClaveValor(co2, c2);
        m.addClaveValor(co1, c1);
        System.out.println("Primera llave (en orden inverso): " + m.codigoPrimerLlave());
        // Imprimir todas las claves y valores en el TreeMap
        for(Map.Entry<CodigoLlave,CaracterLlave> entry: m.getMapass().entrySet()){
            System.out.println("Clave " + entry.getKey() + " Valor " + entry.getValue());
        }
    }
}