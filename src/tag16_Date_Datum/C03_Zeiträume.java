package tag16_Date_Datum;

import java.time.LocalDate;
import java.time.Month;

public class C03_Zeiträume {

    // Statische Methode mit Datumfunktionen

    public static void ausgabe(LocalDate start, LocalDate ende){
        //Methode schreiben, die mich an Termine arinnert.
        // Ich soll jeden Monat daran erinnert werden..
        while(start.isBefore(ende)){
            System.out.println("Miete bezahen: "+start);
            start= start.plusMonths(1);
        }

    }

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025, Month.JANUARY,1);
        LocalDate ende = LocalDate.of(2025,Month.DECEMBER,1);

        ausgabe(start, ende);
    }
}
