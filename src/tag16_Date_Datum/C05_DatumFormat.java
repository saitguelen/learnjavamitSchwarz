package tag16_Date_Datum;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class C05_DatumFormat {



        public static void main (String...strings ) {
            //Vom String zu Date and Time
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");//2020-02-25
            LocalDate date = LocalDate.parse("02 25 2020", formatter);
            LocalTime time = LocalTime.parse("22:33");

            //Nicht im Format, dass wir wollen
            System.out.println(date);
            System.out.println(time);

            //String-Repräsentation vom Datum
            String text = date.format(formatter);
            System.out.println(text);//01 25 2020
            //Wieder zurück zum Date
            LocalDate parsedDate = LocalDate.parse(text, formatter);
            System.out.println(parsedDate);

        }
    }


