package tag12_Exception;

import javax.swing.*;

public class C04_HTMLTagGenerator {

    public static void main(String[] args) {
        // 1. Benutzereingabe mit JOptionPane

        String text = JOptionPane.showInputDialog(null,"Bitte geben Sie einen Text ein:");
        String tag =JOptionPane.showInputDialog(null,"Bitte geben Sie ein HTML-Tag ein (z.B. p,b,i,u");

        if(text == null || tag==null|| text.trim().isEmpty()||tag.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ungültige Eingabe!", "Fehler", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // 2. HTML-Text mit StringBuilder generieren

        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<").append(tag).append(">")
                .append(text)
                .append("</").append(tag).append(">");

        String htmlText = htmlBuilder.toString();
        int zeichenAnzahl=htmlText.length();

        // 3. Ergebnis anzeigen

        String ausgabe = "Generierter HTML-text:\n"+htmlText+
                "\n\nAnzahl der Zeichen: "+ zeichenAnzahl+ " Zeichen";

        JOptionPane.showMessageDialog(null, ausgabe, "HTML-Generator", JOptionPane.INFORMATION_MESSAGE);
    }
}
