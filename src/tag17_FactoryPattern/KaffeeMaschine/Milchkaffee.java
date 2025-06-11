package tag17_FactoryPattern.KaffeeMaschine;

public class Milchkaffee implements Kaffee {
    @Override
    public void zubereiten() {
        System.out.println("Bereite  Milchkaffee mit viel Milch zu");
    }
}
