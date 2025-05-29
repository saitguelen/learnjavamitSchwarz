package tag12_Exception;

import javax.swing.*;

public class C05_PreisrechnerMitMwSt {
    public static void main(String[] args) {
        double nettoPreis = 0;
        double mwstSatz = 19;
        //Nettopreis eingeben und validieren
        while(true){
        String eingabe= JOptionPane.showInputDialog(null, "Biite gebeb Sie den Nettopereis ein: ");
        try {
            nettoPreis = Double.parseDouble(eingabe);
            if(nettoPreis<0){
                JOptionPane.showMessageDialog(null, "❌ Der Nettopreis darf nicht negativ sein.");
            } else {
                break;
            }
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "❌ Ungültige Eingabe! Bitte eine Zahl eingeben.");
        }
        }
        double endPreis = nettoPreis*(1+mwstSatz/100);

        // Ausgabe
        String ausgabe = "Nettopreis: "+nettoPreis+ "€\n"+
                "Mehrwertsteuer: "+mwstSatz+ "%\n"+
                "======================================\n"+
                "Endpreis:"+ String.format("%.2f", endPreis)+"€";

        JOptionPane.showMessageDialog(null, ausgabe);

    }
}
