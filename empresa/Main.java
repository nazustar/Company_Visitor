package empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new ProductoFisico("Teclado Mecánico", 250000, 1.2, 15000));
        productos.add(new ProductoDigital("Licencia Office", 180000, "XXXXX-XXXXX-XXXXX", 365));
        productos.add(new ProductoFisico("Monitor 27\"", 1200000, 4.5, 35000));
        productos.add(new ProductoDigital("Curso de Java", 85000, "CURSO-2024-JAVA", 180));

        System.out.println("======= REPORTE DE PRODUCTOS =======\n");
        for (Producto p : productos) {
            p.generarReporte();
            System.out.println();
        }

        System.out.println("======= RESUMEN DE IMPUESTOS =======");
        double totalImpuestos = 0;
        for (Producto p : productos) {
            totalImpuestos += p.calcularImpuesto();
        }
        System.out.println("Total impuestos a pagar: $" + totalImpuestos);
    }
}