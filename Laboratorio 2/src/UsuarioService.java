//Un buen principio seria hacer al UsuarioService una interfaz, para que cache no dependiera de una implementacion especifica, pero con una clase funciona para ver el ejemplo solicitado

class UsuarioService {
    public Usuario cargarUsuario(String id){
        try{
            System.out.println("Cargando usuario desde la base de datos");
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return new Usuario(id, "Usuario_"+ id, "Cliente", "Preferencias");
    }
}

