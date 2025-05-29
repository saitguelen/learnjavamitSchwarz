package tag11_Exception;

public class C14_Aufgabe5_FitnessIdealgewichtohneException {

    /*Manchmal kommt es vor, dass Methoden nicht planmäßig beendet werden können, da die
Voraussetzungen für eine korrekte Ausführung der Methoden nicht gegeben sind.
Das folgende Beispiel betrachtet die Methode idealgewicht( ), die auf der Basis der
folgenden Faustformel das Berechnen des Idealgewichts eines Mannes ermöglich. (Es gibt
auch eine Formel für Frauen, die wir uns jedoch an dieser Stelle sparen).
Idealgewicht = Körpergröße (in cm) - 100
Diese Funktion ist nur unter bestimmten Voraussetzungen anwendbar:
1. Der Mann muss mindestens 17 Jahre alt sein.
2. Der Mann muss jünger als 50 Jahre alt sein.
3. Der Mann muss eine Körpergröße von mindestens 1,00 m haben.
Nur dann, wenn alle Bedingungen erfüllt sind, kann die Methode idealgewicht( ) auf
der Grundlage der Faustformel halbwegs brauchbare Ergebnisse liefern. Auf den folgenden
zwei Seiten ist eine Umsetzung zu sehen, die versucht auch ohne Exceptions diesen
Rahmenbedingungen gerecht zu werden*/

    int alter;
    double groesse;

    //Konstruktoren
    public C14_Aufgabe5_FitnessIdealgewichtohneException() {
        this(20, 180.0);
    }

    public C14_Aufgabe5_FitnessIdealgewichtohneException(int alter, double groesse) {
        this.alter = alter;
        this.groesse = groesse;

    }
    //InstanzMethoden

    public double idealgewicht() {
        if(alter < 17)
        {
            System.out.println("zu jung");
            return 0.0d;
        }
        if(alter > 50)
        {
            System.out.println("zu alt");
            return 0.0d;
        }
        if(groesse < 100d)
        {
            System.out.println("zu klein");
            return 0.0d;
        }
        return this.groesse - 100d;
    }

    public static void main(String[] args) {

            C14_Aufgabe5_FitnessIdealgewichtohneException luise = new C14_Aufgabe5_FitnessIdealgewichtohneException();
            C14_Aufgabe5_FitnessIdealgewichtohneException paul = new C14_Aufgabe5_FitnessIdealgewichtohneException(16, 170d);
            C14_Aufgabe5_FitnessIdealgewichtohneException berta = new C14_Aufgabe5_FitnessIdealgewichtohneException(23, 99d);
            System.out.println(luise.idealgewicht());
            System.out.println();
            System.out.println(paul.idealgewicht());
            System.out.println();
            System.out.println(berta.idealgewicht());
        }
    }





