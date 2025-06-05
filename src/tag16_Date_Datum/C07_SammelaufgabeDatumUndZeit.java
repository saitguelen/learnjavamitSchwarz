package tag16_Date_Datum;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class C07_SammelaufgabeDatumUndZeit {
    /*
 Anzeige des heutigen Datums und des aktuellen Wochentags.
 Ermittlung der Uhrzeiten für den Tagesbeginn und Tagesende.
 Prüfung, ob ein Jahr ein Schaltjahr ist.
 Bestimmung des Wochentags eines beliebigen Datums.
 Berechnung der Anzahl der Tage in einem bestimmten Monat eines Jahres
*/

    static Scanner scanner = new Scanner(System.in);
    static Locale localeDE = Locale.GERMAN;
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy ", localeDE);


    // 1)  Anzeige des heutigen Datums und des aktuellen Wochentags.
    public static void zeigeHeutigesDatumUndWochentag() {
        LocalDate heute = LocalDate.now();
        String tag = heute.getDayOfWeek().getDisplayName(TextStyle.FULL, localeDE);
        System.out.println("Heute ist der  " + heute.format(formatter) + "( " + tag + " )");//Heute ist der  05.06.2025 ( Donnerstag )

        /*„In dieser Methode ermitteln wir das heutige Datum mit LocalDate.now().
            Anschließend fragen wir mit .getDayOfWeek() den Wochentag ab und
            geben diesen in deutscher Sprache mit getDisplayName(...) aus.“*/
    }

    // 2) Ermittlung der Uhrzeiten für den Tagesbeginn und Tagesende.
    public static void zeigeTagesbeginnUndEnde() {
        System.out.println("Tagesbeginn: " + LocalTime.MIN);
        System.out.println("Tagesende: " + LocalTime.MAX);

        /*„Hier zeigen wir den Tagesbeginn und das Tagesende mit Hilfe der Konstanten LocalTime.MIN und LocalTime.MAX an.
        MIN entspricht 00:00, und MAX entspricht 23:59:59.999999999.“
        Vorteil: Praktisch, um z.B. tägliche Zeitbereiche zu definieren.*/
    }

    // 3) Prüfung, ob ein Jahr ein Schaltjahr ist.
    public static void pruefeSchaltjahr() {
        System.out.println("Bitte geben Sie ein Jahr ein? ");
        int jahr = Integer.parseInt(scanner.nextLine());
        boolean istSchaltjahr = Year.isLeap(jahr);
        System.out.println("Ist " + jahr + " ein Schaltjahr?--> " + (istSchaltjahr ? "Ja "+jahr+" ist Schaltjahr." : "Nein " +jahr+ " ist kein Schaltjahr."));

        /*„In dieser Methode fragen wir den Benutzer nach einem Jahr.
            Wir verwenden dann Year.isLeap(jahr), um zu prüfen, ob es ein Schaltjahr ist.
            Die Methode gibt true zurück, wenn das Jahr ein Schaltjahr ist.*/
    }

    // 4) Bestimmung des Wochentags eines beliebigen Datums.
    public static void ermitteleWochentag() {
        System.out.println("Bitte geben Sie Datum mit (TT.MM.JJJJ) ein: ");
        String eingabe = scanner.nextLine();
        try {
            LocalDate datum = LocalDate.parse(eingabe, formatter);
            String wochentag = datum.getDayOfWeek().getDisplayName(TextStyle.FULL, localeDE);
            System.out.println("Der Wochentag ist: " + wochentag);
        } catch (Exception e) {
            System.out.println("Ungültiges Datum. Bitte im Format TT.MM.JJJJ eingeben.");
        }

            /*Hier lassen wir den Benutzer ein Datum im Format TT.MM.JJJJ eingeben.
            Wir verwenden LocalDate.parse(...) mit einem deutschen Formatter.
            Dann geben wir den Wochentag des Datums in deutscher Sprache zurück.“
            Eingabe: 03.10.2024 → Ausgabe: Der Wochentag ist: Donnerstag*/
    }
    // 5) Berechnung der Anzahl der Tage in einem bestimmten Monat eines Jahres

    public static void berechneTageImMonat() {
        System.out.print("Monat (1-12): ");
        int monat = Integer.parseInt(scanner.nextLine());
        System.out.print("Jahr: ");
        int jahr = Integer.parseInt(scanner.nextLine());
        try {
            Month m = Month.of(monat);
            int tage = m.length(Year.isLeap(jahr));
            String monatName = m.getDisplayName(TextStyle.FULL, localeDE);
            System.out.println(monatName + " " + jahr + " hat " + tage + " Tage.");
        } catch (Exception e) {
            System.out.println("Ungültige Monat.");
        }
        /*„In dieser Methode fragt das Programm nach Monat und Jahr.
        Mit Month.of(...) und isLeap(...) berechnen wir die Anzahl der Tage in diesem Monat.
          Zusätzlich geben wir den Monatsnamen in deutscher Sprache aus.“
          Februar 2024 hat 29 Tage.

*/
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- DATUM UND ZEIT MENÜ ---");
            System.out.println("1) Heutiges Datum und Wochentag zeigen");
            System.out.println("2) Tagesbeginn und -ende zeigen");
            System.out.println("3) Schaltjahr prüfen");
            System.out.println("4) Wochentag eines Datums ermitteln");
            System.out.println("5) Tage in einem Monat berechnen");
            System.out.println("0) Beenden");

            System.out.print("Bitte wählen Sie: ");
            String eingabe = scanner.nextLine();

            switch (eingabe) {
                case "1":
                    zeigeHeutigesDatumUndWochentag();
                    break;
                case "2":
                    zeigeTagesbeginnUndEnde();
                    break;
                case "3":
                    pruefeSchaltjahr();
                    break;
                case "4":
                    ermitteleWochentag();
                    break;
                case "5":
                    berechneTageImMonat();
                    break;
                case "0":
                    System.out.println("Programm wird beendet.");
                    return;
                default:
                    System.out.println("Ungültige Eingabe. Bitte erneut wählen.");
            }
        }   /*Im Hauptmenü fragen wir die Eingabe des Nutzers ab.
            Je nach Auswahl wird die passende Methode aufgerufen.
            Mit der Eingabe 0 kann das Programm beendet werden.*/
    }

}
