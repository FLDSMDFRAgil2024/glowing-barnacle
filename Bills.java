

public class Bills {
    private String descripcion;
    private double cantidad;
     private categoria categoria;

    public Bills(String descripcion, double cantidad, categoria categoria) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }
}
