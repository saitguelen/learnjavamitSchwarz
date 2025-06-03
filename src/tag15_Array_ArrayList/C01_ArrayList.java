package tag15_Array_ArrayList;

import java.util.ArrayList;

public class C01_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> städte = new ArrayList<>();

        //Etwas hinzufügen
        städte.add("Berlin");
        städte.add("Hamburg");
        städte.add("Bremen");
        städte.add("Heidelberg");

        //Zum Zugriff der Elemnte
        System.out.println(städte.get(0));
        System.out.println(städte.get(1));
        System.out.println(städte.get(2));
        System.out.println(städte.get(3));

        //Element aktualisiert
        städte.set(1, "Münschen");//Wurde mit Münschen verändert Hamburg

        System.out.println(städte.get(1));

        //Element löschen
        städte.remove(2);//Bremen wurde gelöscht
        System.out.println(städte.get(2));

        //Länge der Liste
        System.out.println("Boyut: "+städte.size());

        for(String stadt:städte){
            System.out.println(stadt);
        }

        String[] farben={"rot", "grün","gelb","blau","braun","schwarz","weiß"};
        //Erstellt und initialisert  sieben Elemnte in namen "farben"

        for(String farb : farben){
            System.out.print(farb+" ");//rot grün gelb blau braun schwarz weiß

        }
        System.out.println("\n"+farben[3]);//blau

    }
}
