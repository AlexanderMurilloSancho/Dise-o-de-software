class PantallaLCD implements Observer{
    @Override
    public void actualizar(double temperatura){
        System.out.println("Pantalla LCD-> Temperatura: "+ temperatura+" Grados celsius");
    }
}
