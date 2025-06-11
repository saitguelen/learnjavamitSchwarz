package tag17_FactoryPattern.KaffeeMaschine;

public class MacchiatoFactory extends KaffeeFactory {
    @Override
    public Kaffee erstelleKaffee() {
        return new Macchiato();
    }
}
