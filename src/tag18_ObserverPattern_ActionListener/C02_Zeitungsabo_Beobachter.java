package tag18_ObserverPattern_ActionListener;

import java.util.Observer;
import java.util.Observable;

public class C02_Zeitungsabo_Beobachter implements Observer {/*Dies bedeutet, dass unsere Zeitungsabo-Klasse ein Beobachter ist
                                                        und die Methode update() bereitstellen muss..
                                                        Bu, Zeitungsabo sınıfımızın bir Gözlemci olduğunu ve
                                                        update() metodunu sağlamak zorunda olduğunu belirtir.*/

    private String subscriberName; // Name des Abos
    private String lastReceivedIssue; // Anzahl der zuletzt erhaltenen Zeitungen

    public C02_Zeitungsabo_Beobachter(String subscriberName) {
        this.subscriberName = subscriberName;
        System.out.println("Zeitungsabo erstellt für: " + subscriberName);
    }

    // Methode, die bei Benachrichtigung von Observable aufgerufen wird
    @Override
    public void update(Observable o, Object arg) {
        // Wir können überprüfen, welche Observable uns informiert
        /*update(Observable o, Object arg): Bu metod, Birdzeitung sınıfının notifyObservers() metodu çağrıldığında otomatik olarak çağrılır.
        o: Bizi bilgilendiren Observable nesnesini temsil eder (bu durumda Birdzeitung örneği).
        arg: notifyObservers() metoduna parametre olarak gönderdiğimiz bilgidir (bu durumda yeni gazete sayısının adı).*/
        /*update(Observable o, Object arg): Diese Methode wird automatisch aufgerufen,
        wenn die Methode notifyObservers() der Klasse Birdzeitung aufgerufen wird.
        - o: Stellt das Observable-Objekt dar, das uns benachrichtigt
        - arg: die Informationen, die wir als Parameter an die Methode notifyObservers() senden (in diesem Fall der Name der neuen Zeitungsausgabe).*/
        if (o instanceof C01_Birdzeitung_Subjekt) {
            String newIssue = (String) arg; //Konvertiert das eingehende Argument in String  Gelen argümanı String'e dönüştürürüz
            this.lastReceivedIssue = newIssue;
            System.out.println(subscriberName + " hat neue Ausgabe erhalten: " + newIssue);
            // Hier können auch andere teilnehmerbezogene Operationen durchgeführt werden, z. B. das Speichern in der Datenbank
            //        } Burada abone ile ilgili başka işlemler de yapılabilir, örneğin veritabanına kaydetme
        }
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public String getLastReceivedIssue() {
        return lastReceivedIssue;
    }

}
