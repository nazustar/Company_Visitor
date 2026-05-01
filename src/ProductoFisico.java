package src;

public class ProductoFisico implements Producto {
    
    // Atributos agredados.
    private double precio;
    private String nombre;
    
    // Atributos base.
    private double peso;
    private double costoEnvio;

    // Constructor.
    public ProductoFisico (double precio, String nombre,
    double peso, double costoEnvio) {
        this.precio = precio;
        this.nombre = nombre;
        this.peso = peso;
        this.costoEnvio = costoEnvio;
    }

    public double getPrecio () {
        return precio;
    }

    public String getNombre () {
        return nombre;
    }

    public double getPeso () {
        return peso;
    }

    public double getCostoEnvio () {
        return costoEnvio;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}