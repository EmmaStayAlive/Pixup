package PerezCaldera.Pixup.RegistrarUsuario;

public class Domicilio {
    private int id;
    private String calle;
    private String numExt;
    private String numInt;
    private Usuario usuario;
    private Colonia colonia;
    private TipoDomicilio tipoDomicilio;


    public Domicilio(int id, String calle, String numExt, String numInt, Usuario usuario, Colonia colonia, TipoDomicilio tipoDomicilio) {
        this.id = id;
        this.calle = calle;
        this.numExt = numExt;
        this.numInt = numInt;
        this.usuario = usuario;
        this.colonia = colonia;
        this.tipoDomicilio = tipoDomicilio;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumExt() {
        return numExt;
    }

    public void setNumExt(String numExt) {
        this.numExt = numExt;
    }

    public String getNumInt() {
        return numInt;
    }

    public void setNumInt(String numInt) {
        this.numInt = numInt;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Colonia getColonia() {
        return colonia;
    }

    public void setColonia(Colonia colonia) {
        this.colonia = colonia;
    }

    public TipoDomicilio getTipoDomicilio() {
        return tipoDomicilio;
    }

    public void setTipoDomicilio(TipoDomicilio tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }
}
