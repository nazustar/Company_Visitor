package src;

public class DescuentoVisitor implements Visitor{

    @Override
    public void visit(ProductoFisico p) {
    
        double descuento = (p.getPrecio() * 0.05);
        double total = (p.getPrecio() - descuento);
        
        System.out.println("Nombre del producto: " + p.getNombre());
        System.out.println("Tipo de producto: Físico");
        System.out.println("Valor original: " + p.getPrecio());
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio total: " + total + "\n");
    
    }

    @Override
    public void visit(ProductoDigital p) {

        double descuento = (p.getPrecio() * 0.10);
        double total = (p.getPrecio() - descuento);
    
        System.out.println("Nombre del producto: " + p.getNombre());
        System.out.println("Tipo de producto: Digital");
        System.out.println("Valor original: " + p.getPrecio());
        System.out.println("Descuento: " + descuento);
        System.out.println("Precio total: " + total + "\n");
    
    }
    
}
