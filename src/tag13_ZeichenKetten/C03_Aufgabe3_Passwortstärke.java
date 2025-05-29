package tag13_ZeichenKetten;

public class C03_Aufgabe3_Passwortstärke {

    /*Starke Passwörter erfüllen die folgenden Eigenschaften:
• mindestens 8 Zeichen
• enthält mindestens einen Kleinbuchstaben
• enthält mindestens einen Großbuchstaben
• enthält mindestens eine Ziffer
• enthält mindestens ein Sonderzeichen
Aufgabenstellung
Schreiben Sie eine statische Methode mit Namen istStark, die prüft, ob es sich bei einem
Passwort, übergeben als String, um ein starkes Passwort handelt.
Die Prüfung auf Sonderzeichen soll in dieser Aufgabe auf die Sonderzeichen '! ' und '* '
beschränkt werden.*/

    public static String istStark(String passwort){

        if(passwort == null || passwort.length()<8){ //Zuerst wird überprüft, ob das Passwort mindestens 8 Zeichen lang ist.
            return "Passwort ist zu kurz (mindestens 8 Zeichen)";

        }
        boolean hatKlein= false;
        boolean hatGross = false;
        boolean hatZahl = false;
        boolean hatSonder = false;

        for( int i=0; i<passwort.length();i++){  //Danach gehen wir Zeichen für Zeichen durch den String mit einer Schleife.
            char c = passwort.charAt(i);
                                                                  //Wir überprüfen:
            if(Character.isLowerCase(c)) hatKlein = true;   //Ist der Buchstabe klein? → hatKlein = true
            else if (Character.isUpperCase(c)) hatGross = true;  //Ist der Buchstabe groß? → hatGross = true
            else if (Character.isDigit(c)) hatZahl = true;     //Ist das Zeichen eine Ziffer? → hatZahl = true
            else if (c== '!' || c =='*') hatSonder = true;     //Ist es ein Sonderzeichen (! oder *)? → hatSonder = true

            }

        if (!hatKlein) return "Fehlt Kleinbuchstabe";
        if (!hatGross) return "Fehlt Großbuchstabe";
        if (!hatZahl) return "Fehlt Ziffer";
        if (!hatSonder) return "Fehlt Sonderzeichen (! oder *)";

        return "Passwort ist stark";  //Nur wenn alle vier Bedingungen erfüllt sind, ist das Passwort stark → Rückgabewert true.

        }

    public static void main(String[] args) {
        System.out.println(istStark("eVJo2!8IrRo"));  // Passwort ist stark
        System.out.println(istStark("aH6*LauTp21u")); // Passwort ist stark
        System.out.println(istStark("!2Bcv"));        // Passwort ist zu kurz (mindestens 8 Zeichen)
        System.out.println(istStark("Passwort123"));  // Fehlt Sonderzeichen (! oder *)
        System.out.println(istStark("53cr3ts!"));     // Fehlt Großbuchstabe
        System.out.println(istStark("123456"));       //Passwort ist zu kurz (mindestens 8 Zeichen)
    }

        }





