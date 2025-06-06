package tag16_Date_Datum;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.TextStyle;
import java.util.Scanner;

import static tag16_Date_Datum.C07_SammelaufgabeDatumUndZeit.localeDE;

public class C09_DifferenzNaechsterFeiertag2 {

    // Attribute
    static LocalDate heute;
    static String feiertagsName;
    static  LocalDate feiertagsDatum;
    static long tageBisFeiertag;

    //Formatter im deutschen Datumsformat
    static DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd.MM.yyyy");
    //Damit wird das Datum im deutschen Format wie „05.06.2025“ angezeigt.

    // Feiertagsname abfragen

    public static String frageFeiertagsname(Scanner scanner){
        String eingabe= "";
        while(eingabe.isBlank()){
            System.out.print("Wie heißt der Feiertag?: ");  //z.B. Weihnachten
            eingabe= scanner.nextLine().trim();
            if(eingabe.isBlank()){
                System.out.println("Eingabe darf nicht leer sein.");
            }
        }
        return eingabe;
        /*  Diese Methode fragt den Namen des Feiertags ab.
            Wenn die Eingabe leer ist, bekommt der Benutzer eine Fehlermeldung.
            Das Programm fragt so lange nach, bis ein gültiger Name eingegeben wurde.*/
    }
    // Datum abfragen mit Prüfung
    public static LocalDate frageDatum (String aufforderung, Scanner scanner){

        while (true){
            System.out.println(aufforderung);
            String eingabe = scanner.nextLine().trim();
            try {
                return LocalDate.parse(eingabe,formatter);
            }catch (DateTimeParseException e){
                System.out.println("Ungültiges Format. Bitte TT.MM.JJJJ verwenden...");
            }
        }
        /*  Diese Methode fragt das Datum des Feiertags ab.
            Format muss TT.MM.JJJJ sein.
            Bei falschem Format wird eine Fehlermeldung gezeigt und nochmal gefragt.*/

    }
    // Feiertag auf nächstes Jahr setzen, falls nötig
    public static LocalDate feiertagVorbei(LocalDate heute, LocalDate feiertagsdatum) {
        LocalDate angepasst = feiertagsdatum.withYear(heute.getYear());
        if (!angepasst.isAfter(heute)) {
            angepasst = angepasst.plusYears(1);
        }
        return angepasst;
    }/* Diese Methode prüft, ob der Feiertag schon vorbei ist.
        Wenn ja, dann wird das Datum um ein Jahr erhöht.
        So wird der nächste Feiertag im neuen Jahr angezeigt.
        🔧 Verwendete Methoden:
        withYear(...) → ersetzt das Jahr
        plusYears(1) → ein Jahr dazu rechnen*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // 1. Heutiges Datum setzen
        heute = LocalDate.now();
        String tag = heute.getDayOfWeek().getDisplayName(TextStyle.FULL, localeDE);

        // 2. Feiertagsname abfragen
        feiertagsName = frageFeiertagsname(scanner);

        // 3. Datum abfragen
        feiertagsDatum = frageDatum("Wann ist " + feiertagsName + "? (TT.MM.JJJJ): ", scanner);

        // 4. Feiertag anpassen, falls er vorbei ist
        feiertagsDatum = feiertagVorbei(heute, feiertagsDatum);

        // 5. Differenz berechnen
        tageBisFeiertag = feiertagsDatum.toEpochDay() - heute.toEpochDay();

        // 6. Ausgabe
        System.out.println("Heute: " + heute.format(formatter)+ " tag: "+ tag);
        System.out.println(feiertagsName + " ist am: " + feiertagsDatum.format(formatter));
        System.out.println("Noch " + tageBisFeiertag + " Tag(e) bis zum nächsten " + feiertagsName + ".");

        scanner.close();
    }
}
