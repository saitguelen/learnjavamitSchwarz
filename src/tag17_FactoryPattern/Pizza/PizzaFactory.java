package tag17_FactoryPattern.Pizza;

// Abstrakte Fabrik, die die Schnittstelle zur Erstellung von Pizza-Objekten definiert// Abstrakte Fabrik, die die Schnittstelle zur Erstellung von Pizza-Objekten definiert
public abstract class PizzaFactory {

    public abstract Pizza createPizza(String typ);
    //public abstract Doener createDoener(String typ);
}
