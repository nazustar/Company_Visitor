package empresa;

public class ProductoFisico extends Producto {
    private double peso;
    private double costoEnvio;

    public ProductoFisico(String nombre, double precio, double peso, double costoEnvio) {
        super(nombre, precio);
        this.peso = peso;
        this.costoEnvio = costoEnvio;
    }

    @Override
    public double calcularImpuesto() {
        // IVA del 19% + 2% adicional por envío
        return (precio * 0.19) + (costoEnvio * 0.02);
    }

    @Override
    public void generarReporte() {
        System.out.println("=== Producto Físico ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Costo de envío: $" + costoEnvio);
        System.out.println("Impuesto: $" + calcularImpuesto());
        System.out.println("Total: $" + (precio + costoEnvio + calcularImpuesto()));
    }

    public double getPeso() { return peso; }
    public double getCostoEnvio() { return costoEnvio; }
}