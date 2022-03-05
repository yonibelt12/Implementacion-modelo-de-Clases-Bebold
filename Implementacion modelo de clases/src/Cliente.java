public class Cliente extends Usuario{
    public Cliente(){
        super();
    }
    public Cliente(int ID,String correo){
        super(ID,correo);
    }
    public void mostrar(){
        System.out.println("Usuario: "+getUserID()+", Email:"+getEmail());
    }
}
