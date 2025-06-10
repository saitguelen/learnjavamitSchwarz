package tag17_FactoryPattern.MonitorFactoryBasis;

public class App {

    //Erstellen und Ausführen von Monitorobjekten mit MonitorFactory (Aufruf von display()).
    public static void main(String[] args) {
        MonitorFactory factory = new MonitorFactory();

        Object monitor1= factory.createMonitor("Asus");// Wir möchten, dass Factory einen Asus-Monitor baut.
        Object monitor2= factory.createMonitor("MSI");// Wir möchten, dass Factory einen Msi-Monitor baut.

        if (monitor1 instanceof AsusMonitor){  //instanceof ile gelen nesnenin tipi kontrol edilir.Der Typ des eingehenden Objekts wird mit instanceof überprüft.
            ((AsusMonitor)monitor1).display();//Casting
        }

        if (monitor2 instanceof MsiMonitor){
            ((MsiMonitor)monitor2).display();
        }
    }
}
