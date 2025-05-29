package tag11_Exception;

public class C11_Aufgabe2_Quadratwurzel {

    // Quadratwurzel berechnen Methode
    /*Schreiben Sie eine statische Methode, die aus einem double-Wert die Quadratwurzel
berechnet. Der Rückgabewert der Methode ist ebenfalls ein Gleitpunkttyp. Ist der
übergebene Zahlenwert kleiner Null, so soll eine IllegalArgumentException
geworfen werden.
In der main( )-Methode soll die Exception mittels einer try-catch-Klausel behandelt
werden.*/

    public static double berechneWurzel(double zahl){
        if ( zahl < 0){
            throw new IllegalArgumentException("Die Zahl darf nicht negativ sein!!");
        }
        return Math.sqrt(zahl);
    }

    public static void main(String[] args) {
        try {
            System.out.println("Erstmal  richtigen Weg");
            double ergebnis1 = berechneWurzel(16);
            System.out.println("Die Quadratwurzel ist: "+ergebnis1);
            System.out.println();
            System.out.println("Und negative Zahl versucht wird");

            double ergebnis = berechneWurzel(-9);
            System.out.println("\nDie Quadratwurzel ist: "+ergebnis);
        }catch (Exception e){
            System.out.println("Fehler: "+ e.getMessage());
        }
    }
}
