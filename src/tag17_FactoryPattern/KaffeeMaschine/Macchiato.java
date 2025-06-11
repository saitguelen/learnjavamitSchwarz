package tag17_FactoryPattern.KaffeeMaschine;

public class Macchiato implements Kaffee {
    @Override
    public void zubereiten() {
        System.out.println("Macchiato wird der Espresso in einer kleinen Tasse  aufgebrüht und mit einem Löffel Milchschaum zubereitet.");
    }
}
