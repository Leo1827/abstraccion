public abstract class Figura {
    // abstract: se agrega la palabra reservada
    protected double x; // pos en x
    protected double y; // pos en y

    // constructor
    public Figura(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea(); // metodo abstracto

    
}
