package tag09_Enum;

public class Enum {

    enum Note {sehr_gut, gut, befriedigend, ausreichend, mangelhaft, ungenügend};

    //Diese enums haben nütztliche Eigenschaften
    // toString(); Umwandeln des Wertes in Klartext
    //values(): Array mit allen Werte
    //equals(): Test auf Gleichheit
    //enums werden gerne in Switch-Konstrukten eigensetzt, weil sie effizienter sind als
    public static void main(String[] args) {
        System.out.println("Anzahl der Elemente: " + Note.values().length);
        //für enums können wir auch ein for-each-Schleife schreiben
        for(Note note : Note.values()) {
            int wert = 0;

            switch(note) {
                case sehr_gut: wert = 1; break;
                case gut: wert = 2; break;
                case befriedigend: wert = 3; break;
                case ausreichend: wert = 4; break;
                case mangelhaft: wert = 5; break;
                case ungenügend: wert = 6; break;
            }
            System.out.printf("%s = %d\n", note, wert);


        }

    }

}

