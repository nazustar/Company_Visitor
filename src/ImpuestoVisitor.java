package src;

public class ImpuestoVisitor implements Visitor {

    @Override
    public void visit(ProductoFisico p) {

        double impuesto = (p.getPrecio() * 0.19) + (p.getCostoEnvio() * 0.02);
        double total = p.getPrecio() + impuesto;

        System.out.println("Nombre del producto: " + p.getNombre());
        System.out.println("Tipo de producto: Físico");
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Precio total: " + total + "\n");
    }

    @Override
    public void visit(ProductoDigital p) {

        double impuesto = p.getPrecio() * 0.19;
        double total = p.getPrecio() + impuesto;

        System.out.println("Nombre del producto: " + p.getNombre());
        System.out.println("Tipo de producto: Digital");
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Precio total: " + total + "\n");
    }
}