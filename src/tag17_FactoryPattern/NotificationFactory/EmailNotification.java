package tag17_FactoryPattern.NotificationFactory;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sende E-Mail an den Benutzer.");
    }
}
