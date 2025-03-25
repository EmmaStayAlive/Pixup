package PerezCaldera.Pixup.CrearOrden;

import PerezCaldera.Pixup.RegistrarUsuario.Usuario;

public class Orden {
    private int id;
    private double costoTotal;
    private String fecha;
    private int cantidad;
    private String status;
    private double costoU;
    private Usuario usuario;


    public Orden(double costoTotal, int cantidad, String fecha, String status, double costoU, Usuario usuario, int id) {
        this.costoTotal = costoTotal;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.status = status;
        this.costoU = costoU;
        this.usuario = usuario;
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCostoU() {
        return costoU;
    }

    public void setCostoU(double costoU) {
        this.costoU = costoU;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}