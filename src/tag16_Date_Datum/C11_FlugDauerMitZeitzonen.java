package tag16_Date_Datum;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class C11_FlugDauerMitZeitzonen {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm z");

        ZonedDateTime berlinZeit = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        ZonedDateTime istanbulZeit = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));

        System.out.println("Berlin saati: " + berlinZeit.format(formatter));
        System.out.println("İstanbul saati: " + istanbulZeit.format(formatter));




        // Abflug in Frankfurt (Europe/Berlin)
        ZonedDateTime abflug = ZonedDateTime.of(
                2025, 6, 15, 13, 0, 0, 0,
                ZoneId.of("Europe/Berlin"));

        // Ankunft in Quito (America/Guayaquil)
        ZonedDateTime ankunft = ZonedDateTime.of(
                2025, 6, 15, 17, 30, 0, 0,
                ZoneId.of("America/Guayaquil"));

        System.out.println("Abflugzeit (Frankfurt): " + abflug.format(formatter));
        System.out.println("Ankunftszeit (Quito):   " + ankunft.format(formatter));
        System.out.println();

        // ✅ Tatsächliche Flugdauer unter Berücksichtigung der Zeitzonen
        Duration echteDauer = Duration.between(abflug.toInstant(), ankunft.toInstant());
        long stundenEcht = echteDauer.toHours();
        long minutenEcht = echteDauer.toMinutes() % 60;

        System.out.println("✔ Tatsächliche Flugdauer (Zeitzonen berücksichtigt):");
        System.out.println(stundenEcht + " Stunden und " + minutenEcht + " Minuten");
        System.out.println();

        // ❌ Scheinbare Flugdauer (ohne Zeitzonenunterschiede)
        // Das simuliert die Differenz rein zwischen den lokalen Uhrzeiten
        LocalDateTime lokaleAbflugzeit = abflug.toLocalDateTime();
        LocalDateTime lokaleAnkunftszeit = ankunft.toLocalDateTime();

        Duration scheinbareDauer = Duration.between(lokaleAbflugzeit, lokaleAnkunftszeit);
        long stundenSchein = scheinbareDauer.toHours();
        long minutenSchein = scheinbareDauer.toMinutes() % 60;

        System.out.println("✘ Scheinbare Flugdauer (Zeitzonen ignoriert):");
        System.out.println(stundenSchein + " Stunden und " + minutenSchein + " Minuten");

    }
}
