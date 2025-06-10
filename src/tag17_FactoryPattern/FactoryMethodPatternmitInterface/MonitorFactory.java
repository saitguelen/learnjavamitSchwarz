package tag17_FactoryPattern.FactoryMethodPatternmitInterface;

public abstract class MonitorFactory {//Aus dieser Klasse können keine Objekte erzeugt werden. Es findet nur Vererbung statt.

   public abstract Monitor createMonitor(String modellName, int bildschirmGroesse, String auflösung);//Diese Methode hat keinen Körper. Wer erbt, muss diese Methode ausfüllen.
    public Monitor ordnerMonitor(String modellName, int bildschirmGroesse, String auflösung){
        Monitor monitor= createMonitor(modellName, bildschirmGroesse, auflösung);
        return monitor;
    }
}
