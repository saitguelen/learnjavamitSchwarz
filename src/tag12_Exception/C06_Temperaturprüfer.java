package tag12_Exception;

import javax.swing.*;

public class C06_Temperaturprüfer {

    public static void pruefeTemperatur(double temperatur) {
        if (temperatur < -50 || temperatur > 100) {
            throw new IllegalArgumentException("Warnung: Temperaturwert von " + temperatur + " °C überschreitet den kritischen Bereich!");
        }
    }

    public static void main(String[] args) {

        String eingabe = JOptionPane.showInputDialog(null, "Bitte geben Sie die Temperatur ein:");
        //double temperatur = 0;


        try {
            double temperatur = Double.parseDouble(eingabe);
            C06_Temperaturprüfer.pruefeTemperatur(temperatur);

            JOptionPane.showMessageDialog(
                    null,
                    " Temperatur im sicheren Bereich: " + temperatur + " °C",
                    "Temperatur OK",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    " Ungültige Eingabe! Bitte geben Sie  eine gültige Zahl ein.",
                    "Eingabefehler",
                    JOptionPane.ERROR_MESSAGE
            );
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(
                    null,
                    e.getMessage(),
                    "Warnung",
                    JOptionPane.WARNING_MESSAGE
            );

        }


    }


}
