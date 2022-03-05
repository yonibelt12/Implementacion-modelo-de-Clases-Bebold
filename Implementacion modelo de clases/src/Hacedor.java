public class Hacedor extends Usuario{
    private int radioCobertura;
    private String telefono;
    private boolean disponibilidad;
    private Direccion direccion=new Direccion();

    public Hacedor(){
        super();
    }
    public Hacedor(int ID, String correo, int radio, String tel, boolean disp){
        super(ID,correo);
        this.radioCobertura=radio;
        this.telefono=tel;
        this.disponibilidad=disp;
    }
    public void mostrar(){
        System.out.println("Hacedor ID: "+getUserID()+", Email:"+getEmail()+", Radio Cobertura (km): "+getRadio()+", Telefono:"+getTel()+", Disponibilidad:"+getDisp());
    }
    public void setRadio(int rad){
        this.radioCobertura=rad;
    }
    public int getRadio(){
        return(this.radioCobertura);
    }
    public void setTel(String tel){
        this.telefono=tel;
    }
    public String getTel(){
        return(this.telefono);
    }
    public void setDisp(boolean disp){
        this.disponibilidad=disp;
    }
    public boolean getDisp(){
        return(this.disponibilidad);
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
}
