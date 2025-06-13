package tag17_FactoryPattern.Pizza;

public class DeutschlandPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String typ) {
        switch (typ.toLowerCase()) {
            case "thunfisch":
                return new ThunfischPizza();
            case "spinat":
                return new SpinatPizza();
            default:
                throw new IllegalArgumentException("Unbekannte Pizzasorte in Deutschland: " + typ);
        }
    }
}