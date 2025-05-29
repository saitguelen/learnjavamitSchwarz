package tag09_10_Vererbung;

public class BruchRun {

    public static void main(String[] args) {
        Bruch b1 = new Bruch(1,2);
        Bruch b2 = new Bruch(1,4);
        Bruch b3= new Bruch();
        Bruch b4= new Bruch(5);

        b1.anzeigen();//        1/2
        b2.anzeigen();//        1/4
        b3.anzeigen();//        0/1
        b4.anzeigen();//        5/1
        System.out.println();


        b1.addiere(b2).anzeigen(); //6/8
        b1.subtrahiere(b2).anzeigen();//2/8





        System.out.println("Dezimalwert von b3: " + b4.dezimalwert()); //5.0
        System.out.println("Dezimalwert von b3: " + b3.dezimalwert()); // 0.0
        System.out.println("Dezimalwert von summe: " + b1.addiere(b2).dezimalwert()); // 0.75
        System.out.println("Dezimalwert von Subtraktion: " + b1.subtrahiere(b2).dezimalwert()); // 0.25

    }
}
