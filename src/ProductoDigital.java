package src;

public class ProductoDigital implements Producto {
    
    // Atributos agredados.
    private double precio;
    private String nombre;
    
    // Atributos base.
    private String licencia;
    private int diasExpiracion;

    // Constructor.
    public ProductoDigital (double precio, String nombre,
    String licencia, int diasExpiracion) {
        this.precio = precio;
        this.nombre = nombre;
        this.licencia = licencia;
        this.diasExpiracion = diasExpiracion;
    }

    public double getPrecio () {
        return precio;
    }

    public String getNombre () {
        return nombre;
    }

    public String getLicencia () {
        return licencia;
    }

    public int getDiasExpiracion () {
        return diasExpiracion;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}