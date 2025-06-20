package tag18_ObserverPattern_ActionListener.C04_WetterStation;

public class TemperaturAnzeige implements Beobachter {

    private float temperatur;

    @Override
    public void aktualisiere(float temperatur, float luftfeuchtigkeit, float druck) {
        this.temperatur = temperatur;
        display();

    }

    public void display() {
        System.out.println(" Temperaturanzeige: " + temperatur + "°C");
    }

}


