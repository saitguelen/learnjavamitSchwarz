package tag16_Date_Datum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

import static tag16_Date_Datum.C07_SammelaufgabeDatumUndZeit.formatter;

public class C08_DifferenzNaechsterFeiertag {
/*
o Erstelle ein Programm DifferenzNaechsterFeiertag, das:
o Den Namen und das Datum eines Feiertags abfragt.
o Das heutige Datum automatisch ermittelt.
o Prüft, ob der Feiertag vor dem aktuellen Datum liegt. Dann wird die Differenz automatisch
für das nächste Jahr ermittelt.
o Die Differenz in Tagen bis zum nächsten Feiertag berechnet und ausgibt.
o Alle Eingaben und Ausgaben im deutschen Datumsformat TT.MM.JJJJ darstellt.
o Validierung der Eingaben.*/
public static void main(String[] args) {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    Scanner scanner = new Scanner(System.in);
    Locale localeDE =Locale.GERMAN;

    // 1. Heutiges Datum ermitteln
    LocalDate heute = LocalDate.now();
    String tag = heute.getDayOfWeek().getDisplayName(TextStyle.FULL, localeDE);
    System.out.println("Heute ist: "+heute.format(formatter)+ " und tag ist: "+tag);//Heute ist: 05.06.2025 und tag ist Donner

    // 2. Feiertagsname abfragen
    System.out.print("Wie heißt der Feiertag? ");
    String name = scanner.nextLine();

    // 3. Datum des Feiertags abfragen
    System.out.print("Wann ist "+ name + "? (TT.MM.JJJJ): ");
    String datumText = scanner.nextLine();
    LocalDate feiertag;

    try{
        feiertag= LocalDate.parse(datumText, formatter);
    }catch (DateTimeParseException e){
        System.out.println("Falsches Format! Bitte wie TT.MM.JJJJ eingeben.");
        return;
    }
    // 4. Wenn das Datum vorbei ist, auf nächstes Jahr setzen
    feiertag=feiertag.withYear(heute.getYear());
    if(feiertag.isBefore(heute) || feiertag.equals(heute)){
        feiertag= feiertag.plusYears(1);
    }

    // 5. Differenz in Tagen berechnen
    long tage = feiertag.toEpochDay()- heute.toEpochDay();

    //6. Ergebnis ausgeben
    System.out.println("Heute: "+ heute.format(formatter));
    System.out.println(name+ " ist am : "+ feiertag.format(formatter));
    System.out.println("Noch "+tage+ " Tage bis zum nächsten "+ name + ".");



}





}
