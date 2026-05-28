class AireAcondicionado implements Observer{
    @Override
    public void actualizar(double temperatura){
        if (temperatura> 26){
            System.out.println("Aire acondicionado encendido");
            // No es solicitado por el ejercicio, pero podria ponerse que el aire se apagara de darse el caso
        }
    }
}
