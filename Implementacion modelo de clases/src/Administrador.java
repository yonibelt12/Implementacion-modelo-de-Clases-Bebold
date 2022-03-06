public class Administrador extends Usuario{
    private String password;
    private Lista_servicios Lista= new Lista_servicios();

    public Administrador(){
        super();
    }

    public Administrador(int ID,String correo){
        super(ID,correo);
    }

    public void mostrar(){
        System.out.println("\nAdmin ID: "+getUserID()+", Email:"+getEmail()+", Password: "+getPwd());
    }

    public void setPwd(String pwd){
        this.password=pwd;
    }

    public String getPwd(){
        return(this.password);
    }

    public void getLista(){
        Lista.getLista();
    }
}
