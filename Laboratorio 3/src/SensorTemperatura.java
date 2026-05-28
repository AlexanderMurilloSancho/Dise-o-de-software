import java.util.ArrayList;
import java.util.List;

class SensorTemperatura implements Subject{
    private double temperatura;
    private List<Observer> observers= new ArrayList<>();
    @Override
    public void agregarObserver(Observer o){
        observers.add(o);
    }
    @Override
    public void notificarObservers(){
        for (Observer o : observers){
            o.actualizar(temperatura);
        }
    }
    public void setTemperatura(double temperatura){
        System.out.println("\n[Sensor] Nueva temperatura: " + temperatura + " Grados celsius");
        this.temperatura= temperatura;
        notificarObservers();
    }
}
