package empresa;

public abstract class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract double calcularImpuesto();
    public abstract void generarReporte();
}