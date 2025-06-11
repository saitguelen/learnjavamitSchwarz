package tag17_FactoryPattern.NotificationFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Notificationfactory factory;

        Scanner scanner = new Scanner(System.in);
        boolean schleife = false;
        while (!schleife) {

            System.out.print("Welche Nachricht möchtest du dem Benutzer senden?/push/email/sms:  --'q' zum Beenden:  ");
            String userInput = scanner.nextLine();

            if(userInput.substring(0,1).equalsIgnoreCase("q")){
                System.out.println("Programm wird beendet... Auf WIEDERSEHEN!!!");
                break;//Schleife verlassen
            }

            //String userInput="email";//verändert: "email, "sms", "push"

            switch (userInput.toLowerCase()) {
                case "email":
                    factory = new EmailFactory();
                    break;
                case "sms":
                    factory = new SMSFactory();
                    break;
                case "push":
                    factory = new PushFactory();
                    break;
                default:
                    throw new IllegalArgumentException("Unbekannter Typ!");
            }
            factory.send();
        }
    }

}


