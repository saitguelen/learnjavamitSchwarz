package tag13_ZeichenKetten;

import java.sql.SQLOutput;

public class C02_Aufgabe2_String_Kompression {

    public static String komprimiere(String eingabe) {

        if (eingabe == null || eingabe.equals("")) {
            return "";
        }
        String ergebnis = "";//Wir beginnen mit einem leeren String ergebnis.
        char aktuell = eingabe.charAt(0); //Das erste Zeichen wird als aktuelles Zeichen gespeichert (aktuell).
        int count = 1;

        for (int i = 1; i < eingabe.length(); i++) { //Dann durchlaufen wir den String mit einer for-Schleife ab Index 1.
            char zeichen = eingabe.charAt(i);
            if (zeichen == aktuell) { //Wenn das nächste Zeichen gleich dem aktuellen ist, erhöhen wir den Zähler (count++).
                count++;
            } else {
                ergebnis = ergebnis + count + aktuell; //Wenn das Zeichen anders ist, hängen wir count und aktuell an den Ergebnis-String an.
                aktuell = zeichen;
                count = 1; //Danach setzen wir aktuell auf das neue Zeichen und count zurück auf 1.
            }
        }
        ergebnis = ergebnis + count + aktuell;//Nach der Schleife fügen wir noch das letzte Zeichen mit Zähler zum Ergebnis hinzu.
        return ergebnis;
    }

    public static void main(String[] args) {
        System.out.println(komprimiere("WWWWBBBWBBBBBBWW"));  //4W3B1W6B2W
        System.out.println(komprimiere("WBBBBWWWWWWB"));      //1W4B6W1B
    }

}
