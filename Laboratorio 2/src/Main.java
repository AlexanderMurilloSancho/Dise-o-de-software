public class Main{
    public static void main(String[] args){
        UsuarioCache cache= new UsuarioCache();
        long inicio, fin;
        System.out.println("Primer consulta");
        inicio= System.currentTimeMillis();
        Usuario u1= cache.getUsuario("1");
        fin= System.currentTimeMillis();
        System.out.println("Usuario: "+ u1.getNombre());
        System.out.println("Tiempo: "+ (fin- inicio)+ " ms\n");

        System.out.println("Segunda consulta del mismo usuario");
        inicio= System.currentTimeMillis();
        Usuario u2= cache.getUsuario("1");
        fin= System.currentTimeMillis();
        System.out.println("Usuario: "+ u2.getNombre());
        System.out.println("Tiempo: "+ (fin- inicio) + " ms\n");

        System.out.println("Otro usuario nuevo");
        inicio= System.currentTimeMillis();
        Usuario u3= cache.getUsuario("2");
        fin= System.currentTimeMillis();
        System.out.println("Usuario: "+ u3.getNombre());
        System.out.println("Tiempo: "+ (fin- inicio)+ " ms");
    }
}
