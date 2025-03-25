package PerezCaldera.Pixup.RegistrarUsuario;

public class Colonia {
    private int id;
    private String nombre;
    private String cp;
    private Municipio municipio;


    public Colonia(int id, String nombre, String cp, Municipio municipio) {
        this.id = id;
        this.nombre = nombre;
        this.cp = cp;
        this.municipio = municipio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
