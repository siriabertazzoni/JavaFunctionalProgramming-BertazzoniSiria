// questa è l'implementazione per l'interfaccia sull'oggetto sensor
// quando creerò un'altra classe potrò utilizzarla 

public class SensorExternalTempGetter implements PropertyGetter {

    public double getDoubleProperty(Object obj){
        Sensor s = (Sensor) obj;
        return s.getExternalTemp();
    }

}
