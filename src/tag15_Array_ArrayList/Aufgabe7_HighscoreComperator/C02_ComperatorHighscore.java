package tag15_Array_ArrayList.Aufgabe7_HighscoreComperator;

import java.util.Comparator;

public class C02_ComperatorHighscore implements Comparator<C01_Player> {
    @Override
    public int compare(C01_Player p1, C01_Player p2) {
        // Yüksekten düşüğe sıralama için büyükten küçüğe karşılaştır
        return Integer.compare(p2.getHighscore(), p1.getHighscore());
    }
}
