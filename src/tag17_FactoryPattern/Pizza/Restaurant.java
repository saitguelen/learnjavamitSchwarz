package tag17_FactoryPattern.Pizza;

import javax.swing.*;

public class Restaurant {
    public static void main(String[] args) {
        PizzaFactory factory= null;

        String filiale= JOptionPane.showInputDialog("Welche Filiale? (Italien/Deutschland");
        String typ=JOptionPane.showInputDialog("Welche Pizza? (Salami/ Spinat/Thunfisch)");

        try {
            if (filiale.equalsIgnoreCase("italien")){
                factory= new ItalienPizzaFactory();
            } else if (filiale.equalsIgnoreCase("Deutschland")) {
                factory = new DeutschlandPizzaFactory();

            }else {
                throw new IllegalArgumentException("Unbekannte Filiale: "+filiale);
            }

            Pizza pizza = factory.createPizza(typ);
            pizza.zubereiten();
            pizza.backen();
            pizza.schneiden();
            pizza.einpacken();
        }catch (IllegalArgumentException e){
            System.out.println("Fehler: "+e.getMessage());
        }
    }
}
