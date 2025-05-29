package tag11_Exception;

public class C15_Aufgabe5_FitnessIdealgewichtmitException {

    int alter;
    double groesse;

    // Konstruktoren
    public C15_Aufgabe5_FitnessIdealgewichtmitException() {
        this(20, 180.0);
    }

    public C15_Aufgabe5_FitnessIdealgewichtmitException(int alter, double groesse) {
        this.alter = alter;
        this.groesse = groesse;
    }

    // Jetzt mit Exception!
    public double idealgewicht() throws Exception {
        if (alter < 17) {
            throw new Exception("zu jung");//oder IllegalArgumentException geht es
        }
        if (alter > 50) {
            throw new Exception("zu alt");
        }
        if (groesse < 100) {
            throw new Exception("zu klein");
        }

        return groesse - 100;
    }

    public static void main(String[] args) {
        C15_Aufgabe5_FitnessIdealgewichtmitException luise = new C15_Aufgabe5_FitnessIdealgewichtmitException();
        C15_Aufgabe5_FitnessIdealgewichtmitException paul = new C15_Aufgabe5_FitnessIdealgewichtmitException(16, 170);
        C15_Aufgabe5_FitnessIdealgewichtmitException berta = new C15_Aufgabe5_FitnessIdealgewichtmitException(23, 99);

        // Luise
        try {
            System.out.println("Luise: " + luise.idealgewicht());
        } catch (Exception e) {
            System.out.println("Fehler bei Luise: " + e.getMessage());
        }

        // Paul
        try {
            System.out.println("Paul: " + paul.idealgewicht());
        } catch (Exception e) {
            System.out.println("Fehler bei Paul: " + e.getMessage());
        }

        // Berta
        try {
            System.out.println("Berta: " + berta.idealgewicht());
        } catch (Exception e) {
            System.out.println("Fehler bei Berta: " + e.getMessage());
        }
    }
}


