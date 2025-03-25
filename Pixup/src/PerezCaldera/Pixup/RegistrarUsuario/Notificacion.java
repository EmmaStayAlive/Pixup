package PerezCaldera.Pixup.RegistrarUsuario;

public class Notificacion {
    private int id;
    private String fecha;
    private Usuario usuario;
    private TipoNotificacion tipoNotificacion;


    public Notificacion(int id, String fecha, Usuario usuario, TipoNotificacion tipoNotificacion) {
        this.id = id;
        this.fecha = fecha;
        this.usuario = usuario;
        this.tipoNotificacion = tipoNotificacion;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoNotificacion getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(TipoNotificacion tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }
}
