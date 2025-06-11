package tag17_FactoryPattern.KaffeeMaschine;

public class Cappuccino implements Kaffee {
    @Override
    public void zubereiten() {
        System.out.println("Bereite Cappuccino mit Milchschaum zu");
    }
}
