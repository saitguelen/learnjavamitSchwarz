package tag12_Exception.Bestellverwaltung;

import javax.swing.*;

public class BestellApp {
    public static void main(String[] args) {
        try {
            String lagerInput = JOptionPane.showInputDialog("Geben Sie den verfügbaren Lagerbestand ein:");
            int lagerbestand = Integer.parseInt(lagerInput);

            String bestellInput = JOptionPane.showInputDialog("Geben Sie gewünschte Bestellmenge ein: ");
            int bestellmenge = Integer.parseInt(bestellInput);

            // Objekt erstellen

            Lagerverwaltung lager = new Lagerverwaltung(lagerbestand);

            //Bestellung durchführen

            lager.bestellungsDurchfuehren(bestellmenge);

            JOptionPane.showMessageDialog(
                    null,
                    "Bestellung erfolgreich!\n" +
                            "Verbleibender Lagerbestand: " + lager.getLagerbestand(),
                    "Bestellung OK",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    " Ungültige Eingabe! Bitte geben Sie eine ganze Zahl ein.",
                    "Eingabefehler",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (OutOfStockException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Bestellung fehlgeschlagen",
                    JOptionPane.WARNING_MESSAGE
            );
        }catch(IllegalArgumentException e){
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Ungültige Wert",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }
}

