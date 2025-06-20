package tag18_ObserverPattern_ActionListener.C04_WetterStation;

import java.util.ArrayList;
import java.util.List;

public class Wetterstation implements Subjekt {
    private List<Beobachter> beobachter;
    private float temperatur;
    private float luftfeuchtigkeit;
    private float druck;

    //Konstruktor
    public Wetterstation() {
        beobachter = new ArrayList<>();
    }


    @Override
    public void registriereBeobachter(Beobachter b) {
        beobachter.add(b);

    }



    @Override
    public void entferneBeobachter(Beobachter b) {
        beobachter.remove(b);

    }

    @Override
    public void benachrichtigeAlleBeobachter() {
        for(Beobachter b : beobachter)
            b.aktualisiere(temperatur, luftfeuchtigkeit, druck);

    }
    //Diese Methode benachrichtigt alle Beobachter, wenn sich Werte ändern.
    public void setWetterDaten(float temperatur, float luftfeuchtigkeit, float druck) {
        this.temperatur = temperatur;
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        this.druck = druck;
        benachrichtigeAlleBeobachter();
    }

}