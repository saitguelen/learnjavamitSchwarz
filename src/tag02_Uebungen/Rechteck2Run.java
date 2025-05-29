package tag02_Uebungen;

import javax.swing.*;

public class Rechteck2Run {

    public static void main(String[] args) {

        //Eingabe
        String eingabe1= JOptionPane.showInputDialog("Bitte Laenge eingeben:");
        double laenge = Double.parseDouble(eingabe1);

        String eingabe2=JOptionPane.showInputDialog("Bitte Breite eingeben:");
        double breite=Double.parseDouble(eingabe2);

        //Objekt erstellen
        Rechteck2 obj1 = new Rechteck2( laenge, breite);

        Rechteck2 ob2 = new Rechteck2(laenge,breite);

        // 3) Vergrößern um 5
        ob2.laengeVergroessern(5);
        ob2.breiteVergroessern(5);

        // 4) Verkleinern um 2
        ob2.laengeVerkleinern(2);
        ob2.breiteVerkleinern(2);

        //Rechnung
        double langeSeite= obj1.getLangeSeite();
        double kurzeSeite=obj1.getKurzeSeite();
        double diagonale =obj1.getDiagonale();
        double flaeche=obj1.getFlaeche();
        double umfang= obj1.getUmfang();


        //Ausgabe

        System.out.printf("Lange Seite: %.2f\n", langeSeite);
        System.out.printf("Kurze Seite: %.2f\n", kurzeSeite);
        System.out.printf("Diagonale: %.2f\n", diagonale);
        System.out.printf("Flaeche: %.2f\n", flaeche);
        System.out.printf("Umfang: %.2f\n", umfang);
        System.out.println("Länge nach Vergroßern:"+ob2.getLaenge());




        String ausgabe = String.format(
                "Lange Seite: %.2f\nKurze Seite: %.2f\nDiagonale: %.2f\nFlaeche: %.2f\nUmfang: %.2f",
                langeSeite, kurzeSeite, diagonale, flaeche, umfang
        );

        JOptionPane.showMessageDialog(null, ausgabe);




        //Rechteck.laengeAusgeben();





    }
}

