public class App {
    public static void main(String[] args) throws Exception {
        var sensors = new Sensor[]{

            new Sensor(18, 11),
            new Sensor(10, 1),
            new Sensor(20, 2),
            new Sensor(40, 15),
            new Sensor(18, 11),
            new Sensor(18, 11)
        };

        var terms = new Termometro[]{

            new Termometro(18, 11),
            new Termometro(10, 1),
            new Termometro(20, 2),
            new Termometro(40, 15),
            new Termometro(18, 11),
            new Termometro(18, 11)
        };

        System.out.println("La temperatura media esterna rilevata dai sensori è di " + averageExternalTemp(sensors, new SensorExternalTempGetter()) + " gradi");

        System.out.println("La temperatura media esterna rilevata dai termometri è di " + averageExternalTemp(terms, new TermometroExternalTempGetter()) + " gradi");

    }

    
    public static double averageExternalTemp(Sensor[] sensors, PropertyGetter pGetter){
        double sum = 0;
        for(Sensor sensor : sensors){
            // sum += sensor.getExternalTemp(); -> nella somma non prendo il dato dal sensore bensì da pGetter

            sum += pGetter.getDoubleProperty(sensor);
        }

        return (sum / sensors.length);
    }

    public static double averageExternalTemp(Termometro[] terms, PropertyGetter pGetter){
        double sum = 0;
        for(Termometro term : terms){
            // sum += sensor.getExternalTemp(); -> nella somma non prendo il dato dal sensore bensì da pGetter

            sum += pGetter.getDoubleProperty(term);
        }

        return (sum / terms.length);
    }
}
