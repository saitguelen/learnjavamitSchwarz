package tag15_Array_ArrayList.Aufgabe7_HighscoreComperator;

import java.util.Arrays;

public class C03_App {
    public static void main(String[] args) {

        C01_Player[] spielerListe = new C01_Player[]{
                new C01_Player("Sait", 1200),
                new C01_Player("Nesibe", 900),
                new C01_Player("Murat", 1500),
                new C01_Player("Jakob", 1800)
        };

        System.out.println("Vor der Sortierung:");
        for (C01_Player p : spielerListe) {
            System.out.println(p);
        }
        Arrays.sort(spielerListe,new C02_ComperatorHighscore());

        System.out.println("\nNach der Sortierung (nach Highscore):");
        for (C01_Player p : spielerListe) {
            System.out.println(p);
        }
    }
}
