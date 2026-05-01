package src;

public class ReporteVisitor implements Visitor{

    @Override
    public void visit(ProductoFisico p) {
        System.out.println("Nombre del producto: " + p.getNombre());
        System.out.println("Tipo de producto: Físico");
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Peso: " + p.getPeso());
        System.out.print("Costo de envio: " + p.getCostoEnvio() + "\n");
    }

    @Override
    public void visit (ProductoDigital p){
        System.out.println("Nombre del producto: " + p.getNombre());
        System.out.println("Tipo de producto: Digital");
        System.out.println("Precio: " + p.getPrecio());
        System.out.println("Licencia: " + p.getLicencia());
        System.out.print("Dias de expiración: " + p.getDiasExpiracion() + "\n");
    }
    
}
