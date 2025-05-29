package tag13_ZeichenKetten;

public class C04_Aufgabe4_CallmeIshmael {

    /*🔹 Aufgabenstellung:
Schreiben und führen Sie ein Java-Programm aus, das Folgendes macht:

Deklarieren Sie ein String-Objekt mit dem Text "Call me Ishmael".

Geben Sie den gesamten String aus.

Verwenden Sie die Methode length(), um die Länge des Strings auszugeben.

Verwenden Sie charAt(0), um das erste Zeichen auszugeben.

Verwenden Sie charAt(length - 1), um das letzte Zeichen auszugeben.

Verwenden Sie indexOf() und substring(), um das erste Wort aus dem String auszugeben.

*/

    public static void main(String[] args) {

        String s = "Call me Ishmael";

        System.out.println("Gesamten String: "+s);
        System.out.println("Länge von String: "+s.length());
        System.out.println("Erste Zeichen ausgeben: "+s.charAt(0));
        System.out.println("Das letzte Zeichen ausgeben: "+s.charAt(s.length()-1));
        System.out.println("Um das erste Wort:"+s.substring(0,4));
        System.out.println("Oder;");
        int erstesLeerzeichen =s.indexOf(" ");
        System.out.println(s.indexOf(" "));
        String erstesWort= s.substring(0,erstesLeerzeichen);
        System.out.println("Erstes Wort: "+erstesWort);
    }
}
