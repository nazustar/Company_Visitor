package empresa;

public class ProductoDigital extends Producto {
    private String licencia;
    private int diasExpiracion;

    public ProductoDigital(String nombre, double precio, String licencia, int diasExpiracion) {
        super(nombre, precio);
        this.licencia = licencia;
        this.diasExpiracion = diasExpiracion;
    }

    @Override
    public double calcularImpuesto() {
        // IVA del 19% sobre productos digitales
        return precio * 0.19;
    }

    @Override
    public void generarReporte() {
        System.out.println("=== Producto Digital ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Licencia: " + licencia);
        System.out.println("Expira en: " + diasExpiracion + " días");
        System.out.println("Impuesto: $" + calcularImpuesto());
        System.out.println("Total: $" + (precio + calcularImpuesto()));
    }

    public String getLicencia() { return licencia; }
    public int getDiasExpiracion() { return diasExpiracion; }
}