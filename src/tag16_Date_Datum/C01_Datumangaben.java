package tag16_Date_Datum;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class C01_Datumangaben {
    public static void main(String[] args) {
        System.out.println("Datum: "+ LocalDate.now());
        System.out.println("Zeit: "+ LocalTime.now());
        System.out.println("Datun und Zeit :"+ LocalDateTime.now());

        //Andere Möglichkeiten mit Datum und Uhrzeit zu arbeiten
        //of-Methoden
        //Hier werden enums  Verwendet bei Monaten
        LocalDate localdate = LocalDate.of(2025, Month.APRIL,5);
        System.out.println(localdate); //2025-04-05

        LocalTime localTime = LocalTime.of(10,30);
        System.out.println(localTime);//10:30
    }
}
