package tag17_FactoryPattern.KaffeeMaschine;

public abstract class KaffeeFactory {//abstarkt klasse
    public abstract Kaffee erstelleKaffee();

    public void servieren(){
        Kaffee kaffee = erstelleKaffee();
        kaffee.zubereiten();
        System.out.println("Kaffee ist fertig. Guten Appetit!\n");
    }
}
