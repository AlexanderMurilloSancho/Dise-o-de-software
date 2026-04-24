class Usuario{
    private String id;
    private String nombre;
    private String rol;
    private String preferencias;

    public Usuario(String id, String nombre, String rol, String preferencias){
        this.id= id;
        this.nombre= nombre;
        this.rol= rol;
        this.preferencias= preferencias;
    }

    public String getNombre(){
        return nombre;
    }
    //Se deberian de poner todos los gets en un caso real, pero solo usaremos el nombre para el ejercicio

}
