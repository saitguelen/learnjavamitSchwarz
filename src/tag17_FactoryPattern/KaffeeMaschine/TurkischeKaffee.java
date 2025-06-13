package tag17_FactoryPattern.KaffeeMaschine;

public class TurkischeKaffee implements Kaffee {
    @Override
    public void zubereiten() {
        System.out.println("Turkische Kaffee wird mit heißem Wasser zubereitet.");
    }
}
