package src;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Lista de productos.
        List<Producto> productos = new ArrayList<>();

        // Lista de productos.
        
        // Físicos.
        productos.add(new ProductoFisico(900000, "Bicicleta", 15, 100000));
        productos.add(new ProductoFisico(80000, "Camiseta", 0.200, 10000));

        // Digitales.
        productos.add(new ProductoDigital(45000, "Spotify Premium Familiar", "SPT-FAM-6USR-MES", 30));
        productos.add(new ProductoDigital(300000, "Artbook PDF", "Uso personal", 0));

        // Visitors.
        Visitor descuento = new DescuentoVisitor();
        Visitor impuesto = new ImpuestoVisitor();
        Visitor reporte = new ReporteVisitor();

        // Descuentos.
        System.out.println("---DESCUENTOS---");
        for (Producto p : productos) {
            p.accept(descuento);
            System.out.println();
        }

        // Impuestos.
        System.out.println("---IMPUESTOS---");
        for (Producto p : productos) {
            p.accept(impuesto);
            System.out.println();
        }

        // Reportes,
        System.out.println("---REPORTES---");
        for (Producto p : productos) {
            p.accept(reporte);
            System.out.println();
        }
    }
}