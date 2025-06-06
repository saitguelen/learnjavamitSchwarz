package tag16_Date_Datum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;

import static tag16_Date_Datum.C07_SammelaufgabeDatumUndZeit.localeDE;

public class C10_DatumUndZeit {

    //Überlegt euch mal folgendes: Flug nach Ecuador Quito. Wie lange sind wir unterwegs? Und wie sind die Zeitverschiebungen?

    public static void main(String[] args) {
        // Date-Time-API
        //Local Date, weil es Zeitzonen nicht berücksichtigt.
        //Deutschland, Niederlanden, Schweiz, Italien, etc. - da ist es egal.
        //LocalDate sind Objekte - sog. temporale Datentypen, die mit statischen Fabrikmethoden arbeiten.
        //Es gibt keine Konstruktoren, und keine Setter: nur Getter
        //Manchmal müssen wir vom Objekt zur Stringrepräsentation
        LocalDate geb = LocalDate.of(2022, 12, 3);
        System.out.println(geb);//toString()-Methode wird implizit aufgerufen


        //Es gibt viele Getter
        System.out.println(geb.getDayOfMonth());//Tag des Monats es ist der 3.
        System.out.println(geb.getDayOfWeek());//Wochentag//Saturday == Samstag
        System.out.println(geb.getMonthValue());//12
        System.out.println(geb.getYear());//2022
        String wochentag = geb.getDayOfWeek().getDisplayName(TextStyle.FULL, localeDE);
        System.out.println(wochentag);//Samstag

        //Ich kann Objekte nur einmal aufbauen, danach sind sie unveränderlich. Wie beim String.
        LocalDate x = LocalDate.of(2025, 12, 3);
        x = x.plusYears(1);//1 Jahr abziehen, wird nur berücksichtigt, wenn wir erneut zuweisen.
        System.out.println(x);//2024-12-3
        //Mit den at-Methoden kann man in Nachhinein noch einen Zeitanteil hinzufügen.
        //Wird dann zu einem LocalDateTime-Objekt
        LocalDateTime ldt = geb.atTime(0, 0);//2026-12-03T00:00
        System.out.println(ldt);

    }


}
