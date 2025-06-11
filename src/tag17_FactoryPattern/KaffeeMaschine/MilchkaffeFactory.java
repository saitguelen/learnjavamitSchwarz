package tag17_FactoryPattern.KaffeeMaschine;

public class MilchkaffeFactory extends KaffeeFactory {
    @Override
    public Kaffee erstelleKaffee() {
        return new Milchkaffee();
    }
}
