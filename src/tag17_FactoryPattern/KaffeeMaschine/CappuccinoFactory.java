package tag17_FactoryPattern.KaffeeMaschine;

public class CappuccinoFactory extends KaffeeFactory {
    @Override
    public Kaffee erstelleKaffee() {
        return new Cappuccino();
    }
}
