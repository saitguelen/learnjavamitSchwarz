package tag17_FactoryPattern.NotificationFactory;

public class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sende Push-Benacrichtigung.");
    }
}
