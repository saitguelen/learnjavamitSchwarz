package tag17_FactoryPattern.MonitorFactoryBasis;

public class MonitorFactory {

    //Definieren wir eine zentrale Klasse,
    //Diese Klasse wird sich um die Erstellung von Objekten in unserem Namen kümmern.
    // die je nach gewünschtem Monitortyp (z. B. "Asus" oder "MSI") das entsprechende Objekt erstellt.
    //Object zurück, da beide Klassen noch keine gemeinsame Oberklasse haben. Das kann sich später ändern, wenn wir die Schnittstelle
    //Object döner, çünkü her iki sınıfın da ortak bir üst sınıfı henüz yok. Daha sonra interface kullanırsak bu değişebilir.
    //Erzeugt das richtige Monitorobjekt entsprechend dem eingehenden Typ-->gelen type göre dogru monitor olusturur


    public Object createMonitor(String type){//Empfängt einen String (zum Beispiel "Asus") von außen.
        if(type.equalsIgnoreCase("Asus")){
            return new AsusMonitor();
        } else if (type.equalsIgnoreCase("MSI")) {
            return new MsiMonitor();
        }else {
            return null;
        }
    }
}
