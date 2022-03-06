public abstract class Usuario {
    private int UserID;
    private String Email;
    public Usuario(int ID, String correo){
        this.UserID= ID;
        this.Email= correo;
    }

    public Usuario() {

    }

    public int getUserID() {
        return UserID;
    }

    public String getEmail() {
        return Email;
    }

    abstract void mostrar();
}
