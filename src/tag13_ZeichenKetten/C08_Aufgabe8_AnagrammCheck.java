package tag13_ZeichenKetten;

import java.util.Arrays;

public class C08_Aufgabe8_AnagrammCheck {
    public static boolean istAnagramm(String a, String b){

        //Groß unfd kleinschreibung ignorieren

        a= a.toLowerCase();
        b=b.toLowerCase();
        //Wenn Längen interschiedlich sind, kann es kein Anagramm sein

        if(a.length() != b.length()){
            return false;
        }

        //In char Arrays umwandeln
        char[] arrA = a.toCharArray();
        char[] arrB=b.toCharArray();

        //sortieren
        Arrays.sort(arrA);
        Arrays.sort(arrB);

        //Vergleichen
        return Arrays.equals(arrA,arrB);

    }

    public static void main(String[] args) {
        System.out.println(istAnagramm("Ampel", "Palme"));  // true
        System.out.println(istAnagramm("Nagel", "Algen"));  // true
        System.out.println(istAnagramm("Ananas", "Bananas"));  // false
        System.out.println(istAnagramm("Ananam", "Ananas"));// false
    }
}
