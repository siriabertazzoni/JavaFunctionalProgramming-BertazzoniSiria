public class TermometroExternalTempGetter implements PropertyGetter {
    public double getDoubleProperty(Object obj){
        Termometro t = (Termometro) obj;
        return t.getExternalTemp();
    }
}
