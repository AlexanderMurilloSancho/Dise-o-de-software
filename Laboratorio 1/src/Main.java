import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Como desea enviar el mensaje?");
        System.out.println("1 - SMS | 2 - Email");
        int opcion= scanner.nextInt();
        scanner.nextLine();
        GestorNotificaciones factory;
        switch(opcion){
            case 1:
                factory= new ProveedorSMS();
                break;
            case 2:
                factory= new ProveedorEmail();
                break;
            default:
                System.out.println("Tipo de mensaje no valido");
                scanner.close();
                return;
        }
        //Se podria poner mas codigo para atrapar posibles errores, pero se dejo simple por no ser el enfoque del lab :)
        System.out.println("Ingrese el mensaje a enviar:");
        String msg= scanner.nextLine();
        Notificacion notificacion= factory.GenerarNotificacion();
        scanner.close();
        notificacion.enviar(msg);
    }
}
