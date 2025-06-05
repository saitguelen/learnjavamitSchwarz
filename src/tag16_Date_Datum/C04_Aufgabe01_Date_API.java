package tag16_Date_Datum;

import java.time.*;

public class C04_Aufgabe01_Date_API {
    public static void main(String[] args) {
        LocalDate geburstag = LocalDate.of(1987, Month.MAY,15);
        LocalTime feierabend = LocalTime.of(16,30);
        LocalDateTime jetzigenMoment= LocalDateTime.now();
        LocalDate heute= LocalDate.now();
        LocalTime uhr = LocalTime.now();

        Period zeitraum= Period.of(1,10,20);// 1 Jahr, 10 Monate, 20 Tage
        Duration dauer = Duration.ofHours(7).plusMinutes(15);// 7 Stunden, 15 Minuten

        System.out.println("Mein Geburstag: "+geburstag);
        System.out.println("Unserer Feierabend:"+feierabend);
        System.out.println("Und jetzt: "+jetzigenMoment);
        System.out.println("Heute : "+heute);
        System.out.println("Uhr: "+uhr);
        System.out.println("Zeitspanne (Period): " + zeitraum);
        System.out.println("Dauer (Duration): " + dauer);

        /*9 Date-API: Zeitdauern
Berechnen Sie die Zeitdauer zwischen heute und Ihrem Geburtstag sowie zwischen Ihrem
Geburtstag und heute.*/

        System.out.println(Period.between(geburstag,heute));  // P38Y21D

        System.out.println(Period.between(geburstag, heute).getYears()); // 38

        /*10 Monatslänge – Berechnungen
Springen Sie ausgehend vom 2.2.2012 und vom 2.2.2014 sowie vom 4.4.2014 und vom
5.5.2014 mit der Methode plusMonths( ) der Klasse LocalDate einen Monat in die
Zukunft und geben Sie jeweils das Datum aus.*/

        LocalDate datum1 = LocalDate.of(2012, 2, 2);
        LocalDate datum2 = LocalDate.of(2014, 2, 2);
        LocalDate datum3 = LocalDate.of(2014, 4, 4);
        LocalDate datum4 = LocalDate.of(2014, 5, 5);

        // Mit plusMonths(1) wird das Datum um einen Monat in die Zukunft verschoben.
        //LocalDate korrigiert automatisch ungültige Daten (z.B. 30. Februar wird zu 2. März).
        System.out.println("2.2.2012 + 1 Monat: " + datum1.plusMonths(1));
        System.out.println("2.2.2012 + 32 Tage: " + datum1.plusDays(32));
        System.out.println("2.2.2014 + 1 Monat: " + datum2.plusMonths(1));
        System.out.println("4.4.2014 + 1 Monat: " + datum3.plusMonths(1));
        System.out.println("5.5.2014 + 1 Monat: " + datum4.plusMonths(1));




    }
}
