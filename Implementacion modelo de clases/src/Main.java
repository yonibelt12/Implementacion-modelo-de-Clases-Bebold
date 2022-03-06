import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args){
    //Creacion de Usuario Cliente

        Cliente cliente1= new Cliente(1016110092,"jonathanbelt");
        cliente1.mostrar();

    //Creacion de Usuario Administrador

        Administrador admin1= new Administrador(12321743,"yosoyeladmin@gmail.com");
        admin1.setPwd("1234abcd");
        admin1.mostrar();
        admin1.getLista();

    //Creacion de Usuario Hacedor

        Hacedor hacedor1= new Hacedor(1017990038,"hacedor@gmail.com",10,"+57 3118976655",true);
        hacedor1.mostrar();
        hacedor1.setDisp(false);
        hacedor1.getDisp();
        hacedor1.setDireccion("Colombia","Bogotá","Carrera 45 No. 205-59");
        hacedor1.mostrar_direccion();

        hacedor1.agregarServicio("S1");
        hacedor1.eliminarServicio("S1");

        //Crecion de Servicio S1

        Servicio S1 = new Servicio(12000,(float)0.02,"Podar césped","");
        S1.setPesperado((float)15000);
        S1.pagado();

        //Creacion de Solicitud

        Solicitud soli1= new Solicitud((float)30500.75,"Por favor dejar la ropa en la sombra y no mezclar ropa oscura con clarita", Date.valueOf("2022-04-03"),Time.valueOf("23:00:00"),"Colombia","Bogotá","Carrera 7 # 72 A 15");
        soli1.setServ(20500,(float)0.05,"Lavar ropa","Finalizado");
        soli1.mostrar_sol();



    }
}
