package Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EditorGrafico {
    Set<Figuras> figuras = new TreeSet<Figuras>();

    public EditorGrafico(Set<Figuras> figuras){
        this.setFiguras(figuras);
    }

    public Set<Figuras> getFiguras() {
        return figuras;
    }

    public void setFiguras(Set<Figuras> figuras) {
        this.figuras = figuras;
    }

    public void addFigura(Figuras f){
        figuras.add(f);
    }

    public void removeFigura(Figuras f){
        figuras.remove(f);
    }
    public static void main(String[] args) {
        Figuras f1 = new Circulo(3);
        System.out.println(f1.area());
        Figuras f2 = new Circulo(8);
        System.out.println(f2.area());
        Figuras f3 = new Cuadrado(3);
        System.out.println(f3.area());
        Set<Figuras> figuras = new TreeSet<Figuras>();
        EditorGrafico e = new EditorGrafico(figuras);
        e.addFigura(f1);
        e.addFigura(f2);
        e.addFigura(f3);
        System.out.println(e.getFiguras().isEmpty()); //imprime true si el set esta vacio(isEmpty)
        System.out.println(e.getFiguras().contains(f3));//imprime true si el set contiene a la figura f5

        double total = 0;
        Iterator<Figuras>iterator = e.getFiguras().iterator();
        while(iterator.hasNext()){
            total += iterator.next().area();
        }
        System.out.println(total);
    }
}
