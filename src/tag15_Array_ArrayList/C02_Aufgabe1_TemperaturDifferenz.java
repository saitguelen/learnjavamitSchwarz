package tag15_Array_ArrayList;

public class C02_Aufgabe1_TemperaturDifferenz {

    /*Du sollst ein Programm schreiben, das die täglichen Höchsttemperaturen einer Woche (7 Tage)
speichert und die größte Temperaturdifferenz zwischen zwei aufeinanderfolgenden Tagen berechnet.
Beispiel – Array:
Ausgabe:*/
    public static void main(String[] args) {
        int[] temperaturen = {10, 12, 5, 18, 20, 11, 15};
        int maxtemp = temperaturen[0];
        int mintemp = temperaturen[0];


        for (int i = 0; i < temperaturen.length-1; i++) {

            if (maxtemp < temperaturen[i]) {
                maxtemp = temperaturen[i];

            } else if (mintemp > temperaturen[i]) {
                mintemp = temperaturen[i];
            }
        }
        int differenz = maxtemp - mintemp;

        System.out.println("Temperaturen der Woche: ");
        for (int temp : temperaturen) {
            System.out.print( temp+" ");
        }

        System.out.println("\nGrößte Temperaturdifferenz: "+differenz);

    }
}


