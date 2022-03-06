import java.sql.Date;
import java.sql.Time;

public class Solicitud {
    private float monto_ofrecido;
    private String condiciones;
    private Date fecha;
    private Time hora;
    private Direccion direccion=new Direccion();
    private Servicio servicio=new Servicio();

    public Solicitud(){}

    public Solicitud(float monto, String condiciones, Date fecha, Time hora, String pais, String ciudad, String addr){
        this.monto_ofrecido=monto;
        this.condiciones=condiciones;
        this.fecha=fecha;
        this.hora=hora;
        direccion.setDireccion(pais, ciudad, addr);
    }

    public void setSol(float monto, String condiciones, Date fecha, Time hora, String pais, String ciudad, String addr){
        this.monto_ofrecido=monto;
        this.condiciones=condiciones;
        this.fecha=fecha;
        this.hora=hora;
        direccion.setDireccion(pais, ciudad, addr);
    }

    public float getMonto(){
        return monto_ofrecido;
    }

    public String getCondiciones(){
        return condiciones;
    }

    public Date getFecha(){
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void mostrar_sol(){
    System.out.println("Monto: "+getMonto()+", Condiciones: \n"+getCondiciones()+", Fecha y hora: "+getFecha()+" "+getHora()+"\n"+getDireccion()+"\n Servicio: "+servicio.getNombre()+", Valor base: "+servicio.getValor_base()+", Tolerancia: "+servicio.getTolerancia()+", Estado servicio: "+servicio.getEstado()+"\n\n");
    }

    public void setDireccion(String pais, String ciudad, String addr){
        direccion.setDireccion(pais, ciudad, addr);
    }
    public String getDireccion(){
        return (direccion.getPais()+","+direccion.getCiudad()+","+direccion.getAddress());
    }
    public void mostrar_direccion(){
        System.out.println(getDireccion());
    }

    public void setServ(float vbase, float tol, String serv, String estado) {
        servicio.setServicio(vbase,tol,serv,estado);
    }
}
