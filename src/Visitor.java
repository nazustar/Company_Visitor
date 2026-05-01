package src;

// Visitor.

public interface Visitor {
    public void visit (ProductoFisico p);
    public void visit (ProductoDigital p);
}
