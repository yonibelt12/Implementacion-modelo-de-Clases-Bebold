public class Servicio {
    private float valor_base;
    private float tolerancia;
    private String nombre;
    private String estado;
    private Hacedor hacedor= new Hacedor();

    public Servicio(){}

    public Servicio(float vbase, float tol, String nombre, String estado){
        this.valor_base=vbase;
        this.tolerancia=tol;
        this.nombre=nombre;
        this.estado=estado;
    }

    public void setServicio(float vbase, float tol, String nombre, String estado){
        this.valor_base=vbase;
        this.tolerancia=tol;
        this.nombre=nombre;
        this.estado=estado;
    }

    public void setValor_base(float valor_base) {
        this.valor_base = valor_base;
    }

    public float getValor_base() {
        return valor_base;
    }

    public void setTolerancia(float tolerancia) {
        this.tolerancia = tolerancia;
    }

    public float getTolerancia() {
        return tolerancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }


}
