package tag17_FactoryPattern.KaffeeMaschine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        KaffeeFactory factory;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Welchen Kaffee möchtest du? (latte/cappuccino/Milchkaffe/turkisch oder mit 'q' zum Beenden: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.substring(0, 1).equalsIgnoreCase("q")) {
                System.out.println("Kaffee Maschine wird ausgeschaltet. Auf Wiedersehen!");
                break;
            }

//            switch (input){
//                case "latte":
//                    factory= new LatteFactory();
//                    break;
//                case "cappuccino":
//                    factory= new CappuccinoFactory();
//                    break;
//                case "milchkaffee":
//                    factory= new MilchkaffeFactory();
//                    break;
//                default:
//                    System.out.println("Unbekannte Auswahl. Bitte erneut versuchen.\n");
//                    continue;
//            }
            if (input.startsWith("l")) {
                factory = new LatteFactory();
            } else if (input.startsWith("c")) {
                factory = new CappuccinoFactory();
            } else if (input.startsWith("mi")) {
                factory = new MilchkaffeFactory();
            }else if(input.startsWith("ma")){
                factory = new MacchiatoFactory();
            }else if (input.startsWith("t")){
                factory= new TurkischeKaffeeFactory();
            }
            else {
                System.out.println("Unbekannte Auswahl. Bitte erneut versuchen.\n");
                continue;
            }

            factory.servieren();
        }
        scanner.close();
    }
}
