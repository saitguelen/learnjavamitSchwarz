package tag14_StringBuilder;

import javax.swing.*;

public class C08_Aufgabe3_HTMLTagGenerrator {

    /*
    * Eingänge sollten vom Benutzer (mit JoptionPane) übernommen werden:

Text (zum Beispiel: "Hallo")

HTML -Tag (zum Beispiel: "B" oder "I" → Aufmerksamkeit: <oder> sollte nicht verwendet werden!)

HTML -Code muss mit StringBuilder erstellt werden

Joptionpane.showmessagedialog () sollte angezeigt werden:

HTML -Code gebildet

Anzahl der Zeichen des HTML -Code*/
    public static void main(String[] args) {

        //Nimm Eingänge
        String text = JOptionPane.showInputDialog("Geben Sie bitte den Text ein:");
        String tag = JOptionPane.showInputDialog("Geben Sie das HTML-Tag ein(z.B. <b>, <i>,<p>..");

        //Erstellt String Builder

        StringBuilder html = new StringBuilder();
        html.append("<").append(tag).append(">");
        html.append(text);
        html.append("</").append(tag).append(">");

        String ergebnis = html.toString()+"\nAnzahl Zeichen: "+html.length()+" Zeichen;" ;

        JOptionPane.showMessageDialog(null, ergebnis);

    }

}
