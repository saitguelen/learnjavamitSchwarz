package tag02_Uebungen;

import javax.swing.*;

public class KreisRun {

    public static void main(String[] args) {

        //eingabe
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie radius ein:");
        double radius= Double.parseDouble(eingabe);

        // Jetzt wir erstellen ein Objekt
        Kreis kreis = new Kreis(radius);

        //Berechnung
        double umfang=kreis.getUmfang();
        double flaeche=kreis.getFlaeche();

        //Ausgabe
        System.out.printf("Der Radius des Kreises beträgt: %.2f", kreis.getRadius());
        System.out.printf("\nDer Umfang beträgt: %.2f", umfang);
        System.out.printf("\nDie Fläche beträgt: %.2f", flaeche);
        String ausgabe = String.format(
                "Der Radius des Kreises beträgt: %.2f\nDer Umfang beträgt: %.2f\nDie Fläche beträgt: %.2f",
                kreis.getRadius(), umfang, flaeche
        );

        JOptionPane.showMessageDialog(null, ausgabe);



    }
}
