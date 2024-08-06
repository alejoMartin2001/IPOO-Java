package Set;

public abstract class Figuras implements Comparable<Figuras> {
    abstract double area();
    
    @Override
    public int compareTo(Figuras otraFigura) {
        // Implementa la lógica de comparación, por ejemplo, comparando las áreas
        return Double.compare(this.area(), otraFigura.area());
    }
}