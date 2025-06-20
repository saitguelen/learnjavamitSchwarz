package tag18_ObserverPattern_ActionListener;

import java.util.Observable;
/*Anpassung der Klassen "Birdzeitung" und "Zeitungsabo" an das
Observer Pattern In dieser Aufgabe modellieren wir eine Zeitung (Birdzeitung) und
ein System von Abonnenten (Zeitungsabo) unter Verwendung des Observer Patterns.
Szenario: - Wenn die Vogelzeitung eine neue Ausgabe veröffentlicht (ihr Status ändert sich),
muss sie alle Zeitungsabo-Objekte informieren. - Jedes Zeitungsabo-Objekt muss sich selbst aktualisieren
(z.B. aufzeichnen, dass es die neue Ausgabe erhalten hat oder eine Nachricht drucken),
wenn die neue Ausgabe veröffentlicht wird.  Rollen im Observer Pattern (Rollen im Observer Pattern):
- Birdzeitung: Observable (Observable / Subjekt / Konu). Weil sie andere informieren wird,
wenn sich ihr Status ändert (neue Ausgabe).
- Zeitungsabo:Observer--> Beobachter.
Weil es über Änderungen in der Birdzeitung informiert wird.

*/

public class C01_Birdzeitung_Subjekt extends Observable {// Wir erben von der Klasse Observable
                                                    // Damit verfügt
                                                 // unsere Klasse Birdzeitung über alle Fähigkeiten der Klasse Observable,
                                                 // d.h. sie kann Beobachter-Observer verwalten und Benachrichtigungen an sie senden
    private String latestIssue; //Die neuste Ausgabe der Zeitung

    public C01_Birdzeitung_Subjekt(String initialIssue) {
        this.latestIssue = initialIssue;
        System.out.println("Birdzeitung mit Erstausgabe erstellt: " + initialIssue);
    }

    //die Methode, die aufgerufen wird, wenn eine neue Zeitungsausgabe veröffentlicht oder erscheint wird#
    public void newIssueReleased(String newIssue) {
        this.latestIssue = newIssue;
        System.out.println(("\n--- Birdzeitung: Neue Ausgabe '" + newIssue + "' erschienen! ---"));

        // WICHTIG: SetChanged() muss vor dem Senden von Benachrichtigungen an Beobachter--Observer aufgerufen werden
        setChanged();  // Wir zeigen an, dass sich der Status geändert hat.Diese Methode muss vor dem Aufruf von
                      // notifyObservers() aufgerufen werden. Andernfalls werden die Beobachter nicht benachrichtigt.
                     // Die Klasse Observable geht davon aus, dass sie sich nicht ändert, solange setChanged() nicht aufgerufen wird.

        // Wir informieren alle registrierten Beobachter
        notifyObservers(newIssue); // wir senden den Namen der neuen Ausgabe als Argument

    }
    public String getLatestIssue(){
        return latestIssue;
    }
}
