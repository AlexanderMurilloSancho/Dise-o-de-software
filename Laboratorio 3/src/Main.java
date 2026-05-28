public class Main{
    public static void main(String[] args){
        SensorTemperatura sensor= new SensorTemperatura();
        AireAcondicionado aire= new AireAcondicionado();
        Calefactor calefactor= new Calefactor();
        PantallaLCD pantalla= new PantallaLCD();
        sensor.agregarObserver(aire);
        sensor.agregarObserver(calefactor);
        sensor.agregarObserver(pantalla);
        // puse estos valores para probar los casos
        double[] temperaturas= {20, 14, 25, 28, 16, 30, 12};
        for (double temp : temperaturas){
            sensor.setTemperatura(temp);
            try{
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
