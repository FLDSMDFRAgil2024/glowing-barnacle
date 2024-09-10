public class Ingresos {
    private String fuente;
    private double cantidad;

    public Ingresos(String fuente, double cantidad) {
        this.fuente = fuente;
        this.cantidad = cantidad;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
