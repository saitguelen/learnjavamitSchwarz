package tag18_ObserverPattern_ActionListener.C04_WetterStation;

public class DruckAnzeige implements Beobachter {
    private float druck;
    @Override
    public void aktualisiere(float temperatur, float luftfeuchtigkeit, float druck) {
        this.druck= druck;
        display();

    }
    public void display() {
        System.out.println(" Luftdruck: " + druck + " hPa");//Hektopascal (1 hPa = 100 Pa)
    }
}
