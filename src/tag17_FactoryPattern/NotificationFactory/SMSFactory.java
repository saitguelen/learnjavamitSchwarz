package tag17_FactoryPattern.NotificationFactory;

public class SMSFactory extends Notificationfactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();//Diese Fabrik wird ein SMSNotification-Objekt erzeugen.
    }
}
