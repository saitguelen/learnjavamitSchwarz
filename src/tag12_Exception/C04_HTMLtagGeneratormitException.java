package tag12_Exception;

import javax.swing.*;

public class C04_HTMLtagGeneratormitException {

    public static void main(String[] args) throws UngueltigeBenutzereingabeException {
        try {
            // 1. HTML-Tags-Auswahl
            String[] tags = {"b", "i", "u", "h1", "h2", "p", "code"};
            String tag = (String) JOptionPane.showInputDialog(
                    null,
                    "Wähle ein HTML-Tag:",
                    "HTML-Tag Auswahl",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tags,
                    tags[0]
            );

            // 2. Texteingabe
            String text = JOptionPane.showInputDialog(null, "Bitte gib den Text ein:");

            // 3. Eingaben prüfen
            prüfeEingaben(text, tag);

            // 4. HTML generieren mit StringBuilder
            StringBuilder htmlBuilder = new StringBuilder();
            htmlBuilder.append("<").append(tag).append(">")
                    .append(text)
                    .append("</").append(tag).append(">");

            String htmlText = htmlBuilder.toString();

            // 5. Ausgabe
            String ausgabe = "Generierter HTML-Text:\n" + htmlText +
                    "\n\nAnzahl der Zeichen: " + htmlText.length();

            JOptionPane.showMessageDialog(null, ausgabe, "HTML-Generator", JOptionPane.INFORMATION_MESSAGE);

        } catch (UngueltigeBenutzereingabeException e) {
            JOptionPane.showMessageDialog(null, "❌ Fehler: " + e.getMessage(), "Fehlerhafte Eingabe", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void prüfeEingaben(String text, String tag) throws UngueltigeBenutzereingabeException {
        if (text == null || text.trim().isEmpty()) {
            throw new UngueltigeBenutzereingabeException("Text darf nicht leer sein.");
        }
        if (tag == null || tag.trim().isEmpty()) {
            throw new UngueltigeBenutzereingabeException("Kein HTML-Tag ausgewählt.");
        }
    }
}


