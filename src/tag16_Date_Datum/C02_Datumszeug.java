package tag16_Date_Datum;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class C02_Datumszeug {
    public static void main(String[] args) {

        // Nochmal neues Datum
        LocalDate datum = LocalDate.of(2018, Month.AUGUST,6);
        System.out.println(datum);

        //Die Datumfunktionen verhalten sich wie Strings, sind immutable(unveränderlich)
        //Deswegen müssen wir neu zuweisen, wenn wir datum oder zeiträume hinzuaddieren möchten
        //Rückgabewert wird ignoriert falls nicht neu zugewiesen wird
        datum.plusDays(5).plusMonths(2);//eger yeni atama yapmazsak tekrar yukaridakinin aynini yazar
        System.out.println(datum);

        datum = datum.plusDays(5).plusMonths(2);//günü 5 ayi 2 artirir
        System.out.println(datum);

        LocalTime zeit = LocalTime.of(10,30);
        System.out.println(zeit);//10:30

        zeit = zeit.plusHours(3).plusMinutes(25);
        System.out.println(zeit);//13:55




    }
}
