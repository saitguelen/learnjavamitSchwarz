package tag03_toString;

import javax.swing.*;

public class WrapperKlassen {

    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog("Geben Sie eine dreistellige Berechtigungszahl ein (z. B. 750):");

            try {
                byte[] rechte = validateInput(input);

                String output = "Besitzer: " + rechteText(rechte[0]) + "\n" +
                        "Gruppe: " + rechteText(rechte[1]) + "\n" +
                        "Andere: " + rechteText(rechte[2]);

                JOptionPane.showMessageDialog(null, output);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Fehler", JOptionPane.ERROR_MESSAGE);
            }

            int antwort = JOptionPane.showConfirmDialog(null, "Möchten Sie eine weitere Eingabe machen?", "Wiederholen", JOptionPane.YES_NO_OPTION);
            if (antwort != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }

    public static byte[] validateInput(String input) {
        if (input == null || input.length() != 3 || !input.matches("[0-7]{3}")) {
            throw new IllegalArgumentException("Ungültige Eingabe! Nur Ziffern 0-7 erlaubt.");
        }

        byte[] result = new byte[3];
        for (int i = 0; i < 3; i++) {
            result[i] = Byte.valueOf(String.valueOf(input.charAt(i)));
        }
        return result;
    }

    public static String rechteText(byte wert) {
        StringBuilder sb = new StringBuilder();
        if ((wert & 4) != 0) sb.append("Lesen ");
        if ((wert & 2) != 0) sb.append("Schreiben ");
        if ((wert & 1) != 0) sb.append("Ausführen ");
        if (sb.length() == 0) sb.append("Keine Berechtigung");
        return sb.toString();
    }
}
