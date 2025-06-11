package tag17_FactoryPattern.NotificationFactory;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sende SMS an der Benutzer.");
    }
}
