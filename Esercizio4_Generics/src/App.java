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
            new Termometro(20, 1),
            new Termometro(25, 2),
            new Termometro(2, 15),
            new Termometro(17, 11),
            new Termometro(36, 11)
        };

        var frigoTerms = new SensoreFrigo[]{

            new SensoreFrigo(15),
            new SensoreFrigo(23),
            new SensoreFrigo(45),
            new SensoreFrigo(2),
            new SensoreFrigo(18),
            new SensoreFrigo(56)
        };        

        // non mi serve istanziare la proprietà, posso utilizzare direttamente la lambda passando l'interfaccia alla funzione
        
        // PropertyGetter pGetterSens = (Object obj) -> ((Sensor) obj).getExternalTemp();
        // PropertyGetter pGetterTerm = (Object obj) -> ((Termometro) obj).getExternalTemp();

        System.out.println("La temperatura media esterna rilevata dai sensori è di " + averageExternalTemp(sensors, (Object obj) -> ((Sensor) obj).getExternalTemp()) + " gradi");
        System.out.println("La temperatura media esterna rilevata dai termometri è di " + averageExternalTemp(terms, (Object obj) -> ((Termometro) obj).getExternalTemp()) + " gradi");

        System.out.println("La temperatura media esterna rilevata dal frigo è di " + averageExternalTemp(frigoTerms, (Object obj) -> ((SensoreFrigo) obj).getExternalTemp()) + " gradi");
    }

    // (Object obj) -> ((Sensor) obj).getExternalTemp();  => LAMBDA -> non istanzio classi a cui essere strettamente collegati, ma direttamente nella lambda rispecchio l'interfaccia



    
    public static <T> double averageExternalTemp(T[] sensors, GenericPropertyGetter pGetter){
        double sum = 0;
        for(T sensor : sensors){
            // sum += sensor.getExternalTemp(); -> nella somma non prendo il dato dal sensore bensì da pGetter

            // sum += pGetter.getDoubleProperty(sensor);

            // andiamo ad astrarre il tipo di dato
            sum += pGetter.getProperty(sensor);
        }

        return (sum / sensors.length);
    }

}
