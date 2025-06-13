package tag17_FactoryPattern.Pizza;

public abstract  class Doener {
    protected String name;

    public Doener() {
        this("Unbekannter Döner");
    }

    public Doener(String name) {
        this.name = name;
    }
    public void zubereiten() {
        System.out.println(name + " wird zubereitet.");
    }

    public void grillen() {
        System.out.println(name + " wird gegrillt.");
    }

    public void servieren() {
        System.out.println(name + " wird serviert.");
    }
}
