class Calefactor implements Observer{
    @Override
    public void actualizar(double temperatura){
        if (temperatura< 16){
            System.out.println("Calefactor encendido");
        }
        // No es solicitado por el ejercicio, pero se podria poner que el calefactor se apagara de darse el caso
    }
}
