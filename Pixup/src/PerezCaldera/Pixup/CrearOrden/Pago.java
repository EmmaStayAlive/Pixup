package PerezCaldera.Pixup.CrearOrden;

public class Pago {
    private int id;
    private String numtarjeta;
    private double monto;
    private String fecha;
    private Orden orden;


    public Pago(int id, String numtarjeta, double monto, String fecha, Orden orden) {
        this.id = id;
        this.numtarjeta = numtarjeta;
        this.monto = monto;
        this.fecha = fecha;
        this.orden = orden;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumtarjeta() {
        return numtarjeta;
    }

    public void setNumtarjeta(String numtarjeta) {
        this.numtarjeta = numtarjeta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
}
