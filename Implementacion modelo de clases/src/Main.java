import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
        Cliente cliente1= new Cliente(1016110092,"jonathanbelt");
        cliente1.mostrar();

        Administrador admin1= new Administrador(12321743,"yosoyeladmin@gmail.com");
        admin1.setPwd("1234abcd");
        admin1.mostrar();

        Hacedor hacedor1= new Hacedor(1017990038,"hacedor@gmail.com",10,"+57 3118976655",true);
        hacedor1.mostrar();
        hacedor1.setDisp(false);
        hacedor1.getDisp();
        hacedor1.setDireccion("Colombia","Bogotá","Carrera 45 No. 205-59");
        hacedor1.mostrar_direccion();

        Solicitud soli1= new Solicitud((float)30500.75,"Por favor dejar la ropa en la sombra y no mezclar ropa oscura con clarita", Date.valueOf("2022-04-03"),Time.valueOf("23:00:00"),"Colombia","Bogotá","Carrera 7 # 72 A 15");
        soli1.mostrar_sol();
    }
}
