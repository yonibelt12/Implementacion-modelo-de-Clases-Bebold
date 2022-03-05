public class Direccion {
    private String pais;
    private String ciudad;
    private String address;

    public Direccion(){}

    public Direccion(String pais, String ciudad, String addr){
        this.pais=pais;
        this.ciudad=ciudad;
        this.address=addr;
    }
    public void setDireccion(String pais, String ciudad, String addr){
        this.pais=pais;
        this.ciudad=ciudad;
        this.address=addr;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getAddress() {
        return address;
    }
    public void mostrar(){
        System.out.println("País: "+getPais()+", Ciudad: "+getCiudad()+", Dirección: "+getAddress());
    }

}
