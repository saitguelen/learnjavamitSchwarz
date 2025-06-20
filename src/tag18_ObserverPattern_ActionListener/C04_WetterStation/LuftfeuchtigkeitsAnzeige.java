package tag18_ObserverPattern_ActionListener.C04_WetterStation;

public class LuftfeuchtigkeitsAnzeige implements Beobachter {

    private  float luftfeuchtigkeit;

    @Override
    public void aktualisiere(float temperatur, float luftfeuchtigkeit, float druck) {
        this.luftfeuchtigkeit = luftfeuchtigkeit;
        display();

    }

    public void display() {
        System.out.println(" Luftfeuchtigkeit: " + luftfeuchtigkeit + " %");
    }

}
