package tag17_FactoryPattern.KaffeeMaschine;

public class Latte implements Kaffee {
    @Override
    public void zubereiten() {
        System.out.println("Bereite Latte mit Milch und Espresso zu.");
    }
}
