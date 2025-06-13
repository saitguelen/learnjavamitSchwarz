package tag17_FactoryPattern.Pizza;
//Abstrakte Basisklasse für alle Pizzen
public abstract class Pizza {
    String name;

    public Pizza() {
        this("Unbekannte Pizza");
    }


    public Pizza(String name) {//Konstruktor mit parameter
        this.name = name;
    }

    public void zubereiten(){
        System.out.println("Die "+ name+ " wird zubereitet." );
    }

    public void backen(){
        System.out.println("Die "+ name+ " wird im Offen gebacken.");
    }

    public void schneiden(){
        System.out.println("Die "+name+ " wird geschnitten.");
    }

    public void einpacken(){
        System.out.println("Die "+ name+ " wird verpackt.");
    }
}
