package PerezCaldera.Pixup.RegistrarUsuario;

public class TipoNotificacion {
    private int id;
    private String descripcion;
    private String ruta;


    public TipoNotificacion(int id, String descripcion, String ruta) {
        this.id = id;
        this.descripcion = descripcion;
        this.ruta = ruta;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}
