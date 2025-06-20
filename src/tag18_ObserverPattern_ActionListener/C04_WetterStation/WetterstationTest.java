package tag18_ObserverPattern_ActionListener.C04_WetterStation;

public class WetterstationTest {
    public static void main(String[] args) {
        Wetterstation wStation = new Wetterstation();

        TemperaturAnzeige ta = new TemperaturAnzeige();
        LuftfeuchtigkeitsAnzeige la = new LuftfeuchtigkeitsAnzeige();
        DruckAnzeige da = new DruckAnzeige();

        wStation.registriereBeobachter(ta);
        wStation.registriereBeobachter(la);
        wStation.registriereBeobachter(da);
        System.out.println("Aktualisiere Wetterdaten:");
        wStation.setWetterDaten(26.0f, 55.2f,1000.5f);
        //Temperatur, Luftfeuchtigkeit, Druck
        System.out.println("Weitere Änderung...");
        wStation.setWetterDaten(24.0f, 50.0f, 1020.5f);

    }

}
