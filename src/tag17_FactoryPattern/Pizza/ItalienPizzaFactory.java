package tag17_FactoryPattern.Pizza;

public class ItalienPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza(String typ) {
        switch (typ.toLowerCase()) {
            case "salami":
                return new SalamiPizza();
            case "spinat":
                return new SpinatPizza();
            case "thunfisch":
                return new ThunfischPizza();
            default:
                throw new IllegalArgumentException("Unbekannte Pizzasorte in Italien: " + typ);
        }
    }
//    public Doener createDoener(String typ){
//        switch (typ.toLowerCase()){
//            case "lamm":return new LammDoener();
//            case "hühnchen": return new HuehnchenDoener();
//            default:
//                throw new IllegalArgumentException("Unbekannter Döner in Italien: "+typ);
//        }
    }
