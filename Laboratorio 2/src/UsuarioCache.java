import java.util.HashMap;
import java.util.Map;

class UsuarioCache {
    private Map<String, Usuario> cache= new HashMap<>();
    private UsuarioService service= new UsuarioService();

    public Usuario getUsuario(String id){
        if (cache.containsKey(id)){
            System.out.println("Usuario obtenido del cache");
            return cache.get(id);
        }
        Usuario usuario= service.cargarUsuario(id);
        cache.put(id, usuario);
        return usuario;
    }
}
