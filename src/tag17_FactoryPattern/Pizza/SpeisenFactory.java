package tag17_FactoryPattern.Pizza;

public abstract class SpeisenFactory {
    public abstract Pizza createPizza(String typ);
    public abstract Doener createDoener(String typ);
}
