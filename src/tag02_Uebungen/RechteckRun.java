package tag02_Uebungen;

import javax.swing.*;

public class RechteckRun {
    public static void main(String[] args) {

        //Eingabe
        String eingabe1= JOptionPane.showInputDialog("Bitte Laenge eingeben:");
        double laenge = Double.parseDouble(eingabe1);

        String eingabe2=JOptionPane.showInputDialog("Bitte Breite eingeben:");
        double breite=Double.parseDouble(eingabe2);

        //Objekt erstellen
        Rechteck obj1 = new Rechteck( laenge, breite);
        Rechteck r = new Rechteck(10.0, 6.0);  // Nesne oluştur
        r.laengeAusgeben();                   // Metodu çağır


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



        String ausgabe = String.format(
                "Lange Seite: %.2f\nKurze Seite: %.2f\nDiagonale: %.2f\nFlaeche: %.2f\nUmfang: %.2f",
                langeSeite, kurzeSeite, diagonale, flaeche, umfang
        );
        JOptionPane.showMessageDialog(null, ausgabe);


        //Rechteck.laengeAusgeben();





    }
}
