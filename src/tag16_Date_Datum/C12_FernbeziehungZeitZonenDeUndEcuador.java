package tag16_Date_Datum;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;

import static tag16_Date_Datum.C07_SammelaufgabeDatumUndZeit.localeDE;

public class C12_FernbeziehungZeitZonenDeUndEcuador {

    /*“Was passiert, wenn man eine Fernbeziehung
    zwischen Deutschland und Ecuador führt?
    Welche Uhrzeiten sind geeignet zum Telefonieren?
    In diesem Beispiel berechnen wir gemeinsam das Zeitfenster...”

    Stellt euch vor:
    Der Freund lebt in Deutschland und arbeitet bis 16:30 Uhr.
    Die Freundin lebt in Ecuador, sie arbeitet nicht und hat Zeit.
    Er möchte gerne zwischen 16:30 Uhr und 22:00 Uhr mit ihr telefonieren.
    Aber wann ist das eigentlich in Ecuador?*/

    public static void main(String[] args) {

        //Format: 24 Stunden UhrZeit
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        //Freund (in Deutschland): hat Zeit von 16:30 bis 22:00 erstellen wir 2 objekt
        LocalTime arbeitsendeDE = LocalTime.of(16,30);
        LocalTime schlafenszeitDE = LocalTime.of(22,0);

        /*Wir definieren das Zeitfenster in Deutschland:
          16:30 Uhr bis 22:00 Uhr mit LocalTime.*/

        //Lokale Zeitzonen-->definieren wir 2 zoneid De und ecuador
        ZoneId zoneDE = ZoneId.of("Europe/Berlin");
        ZoneId zoneEC= ZoneId.of("America/Guayaquil");
        System.out.println(zoneDE);//"Europe/Berlin"
        System.out.println(zoneEC);//"America/Guayaquil"
        /*Wir wandeln diese Uhrzeiten mit ZonedDateTime in die Zeitzone von Ecuador um:
          ZoneId.of("Europe/Berlin") → ZoneId.of("America/Guayaquil").*/

        //Heutiges Datum und Uhr
        LocalDate heute = LocalDate.now();
        System.out.println("Heute ist: "+heute+ " Name des Tages: " + heute.getDayOfWeek().getDisplayName(TextStyle.FULL, localeDE));
        LocalTime heuteUhr= LocalTime.now();
        System.out.println("Heute Uhr ist: "+ heuteUhr.format(formatter));


        //Zeitfenster(Deutschland-Zeit) - als ZoneDateTime#
        ZonedDateTime startDE = ZonedDateTime.of(heute, arbeitsendeDE, zoneDE);
        ZonedDateTime endeDE = ZonedDateTime.of(heute, schlafenszeitDE, zoneDE);

        //Umwandlung in Ecuador zeit
        ZonedDateTime startEC = startDE.withZoneSameInstant(zoneEC);
        ZonedDateTime endeEC = endeDE.withZoneSameInstant(zoneEC);

        // Aktuelle Zeit in Ecuador
        ZonedDateTime jetztEC = ZonedDateTime.now(ZoneId.of("America/Guayaquil"));

        System.out.println(" Aktuelle Uhrzeit in Ecuador: " + jetztEC.toLocalTime().format(formatter));
        System.out.println(" Telefonfenster in Ecuador:   " + startEC.toLocalTime() + " - " + endeEC.toLocalTime());
        System.out.println();

        //Dauer berechnen
        Duration dauer = Duration.between(startDE.toInstant(), endeDE.toInstant());
        long stunden = dauer.toHours();
        long minuten = dauer.toMinutes() % 60;//Wir berechnen die Dauer mit der Duration-Klasse

        // Ausgabe
        System.out.println(" Telefon-Zeitfenster (aus Sicht von Deutschland):");
        System.out.println("   Von " + arbeitsendeDE.format(formatter) + " bis " + schlafenszeitDE.format(formatter));
        System.out.println("   (In Ecuador: von " + startEC.toLocalTime().format(formatter) + " bis " + endeEC.toLocalTime().format(formatter) + ")");

        System.out.println("\n Gesamtdauer: " + stunden + " Stunden und " + minuten + " Minuten");
        /*  Am Ende zeigen wir:
            die Zeit in Deutschland,
            die umgerechnete Zeit in Ecuador
            und wie viele Stunden das Fenster zum Telefonieren insgesamt beträgt.*/

        //  Prüfung, ob jetzt telefoniert werden kann
        LocalTime jetztUhrEC = jetztEC.toLocalTime();
        if (!jetztUhrEC.isBefore(startEC.toLocalTime()) && !jetztUhrEC.isAfter(endeEC.toLocalTime())) {
            System.out.println("Ihr könnt jetzt telefonieren!");
        } else {
            // Dauer bis zum Beginn berechnen
            Duration warten = Duration.between(jetztUhrEC, startEC.toLocalTime());
            if (warten.isNegative()) {
                // Falls heute verpasst → nächsten Tag berechnen
                warten = Duration.between(jetztUhrEC, LocalTime.MIDNIGHT).plus(Duration.between(LocalTime.MIN, startEC.toLocalTime()));
            }

            //double stunden = warten.toHours();
            //double minuten = warten.toMinutes() % 60;

            System.out.println("!!! Ihr könnt jetzt nicht telefonieren.");
           // System.out.println(" Ihr müsst noch " + stunden + " Stunden und " + minuten + " Minuten warten.");

            /*  In dieser Version überprüft das Programm, ob die aktuelle Uhrzeit in Ecuador innerhalb des Telefonzeitfensters liegt.
                Falls ja, erscheint: „✔ Ihr könnt jetzt telefonieren!“
                Falls nicht, wird die verbleibende Wartezeit in Stunden und Minuten berechnet und angezeigt.*/
        }
    }
}
