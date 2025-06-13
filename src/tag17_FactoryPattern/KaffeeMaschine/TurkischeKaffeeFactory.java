package tag17_FactoryPattern.KaffeeMaschine;

public class TurkischeKaffeeFactory extends KaffeeFactory {
    @Override
    public Kaffee erstelleKaffee() {
        return new TurkischeKaffee();
    }
}
