package tag17_FactoryPattern.KaffeeMaschine;

public class LatteFactory extends KaffeeFactory {
    @Override
    public Kaffee erstelleKaffee() {
        return new Latte();
    }
}
