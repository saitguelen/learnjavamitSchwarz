package tag16_Date_Datum;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class C06_DateTimeBeispiele {

    public static void main(String[] args) {

        // 1. LocalDate – sadece tarih
        LocalDate heute = LocalDate.now();
        LocalDate geburtstag = LocalDate.of(1990, 5, 15);
        System.out.println("Bugünün tarihi (LocalDate): " + heute);
        System.out.println("Doğum günü (LocalDate): " + geburtstag);

        // 2. LocalTime – sadece saat
        LocalTime jetztUhr = LocalTime.now();
        LocalTime feierabend = LocalTime.of(17, 30);
        System.out.println("Şu an saat (LocalTime): " + jetztUhr);
        System.out.println("Feierabend zamanı (LocalTime): " + feierabend);

        // 3. LocalDateTime – tarih ve saat birlikte
        LocalDateTime jetzt = LocalDateTime.now();
        LocalDateTime termin = LocalDateTime.of(2025, 6, 10, 10, 15);
        System.out.println("Şu an (LocalDateTime): " + jetzt);
        System.out.println("Toplantı zamanı (LocalDateTime): " + termin);

        // 4. Period – iki tarih arası fark (yıl, ay, gün)
        LocalDate startDatum = LocalDate.of(2020, 1, 1);
        LocalDate endDatum = LocalDate.of(2023, 6, 1);
        Period zeitraum = Period.between(startDatum, endDatum);
        System.out.println("Period farkı: " + zeitraum); // Örn: P3Y5M0D

        // 5. Duration – iki zaman arası fark (saat, dakika, saniye)
        LocalTime t1 = LocalTime.of(10, 0);
        LocalTime t2 = LocalTime.of(13, 30);
        Duration dauer = Duration.between(t1, t2);
        System.out.println("Duration farkı: " + dauer); // Örn: PT3H30M

        // 6. ZonedDateTime – saat dilimiyle birlikte tarih ve saat
        ZonedDateTime berlinZeit = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        ZonedDateTime istanbulZeit = ZonedDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println("Berlin saati: " + berlinZeit);
        System.out.println("İstanbul saati: " + istanbulZeit);

        // 7. Instant – UTC zaman damgası
        Instant utcZeit = Instant.now();
        System.out.println("UTC zaman damgası (Instant): " + utcZeit);

        // Instant ➝ ZonedDateTime dönüşümü
        ZonedDateTime lokalZeit = utcZeit.atZone(ZoneId.of("Europe/Istanbul"));
        System.out.println("İstanbul saat diliminde UTC zamanı: " + lokalZeit);

        // 8. DateTimeFormatter – tarih ve saati biçimlendirme
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String formatiert = jetzt.format(formatter);
        System.out.println("Biçimlendirilmiş tarih-saat: " + formatiert);
    }

}
