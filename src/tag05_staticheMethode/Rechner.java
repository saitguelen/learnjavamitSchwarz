package tag05_staticheMethode;
import static java.lang.Math.*;

public class Rechner {

    public static void main(String[] args) {
        double zahl =16;
        System.out.println("Unsere Zahl ist: "+zahl);

        double wurzel = sqrt(zahl);
        double potenz =pow(zahl,2);

        System.out.println("Wurzel von "+zahl+ " ist: "+wurzel);
        System.out.println("Potenz von "+zahl+ "hoch 2 ist: "+potenz);

        //wir verwenden eigene Methode
        double verdoppelt = verdopple(zahl);
        System.out.println("Verdopplte Zahl ist: "+verdoppelt);

    }

    //eigebe static Methode
    public static double verdopple(double wert){
        return wert*2;
    }
}
