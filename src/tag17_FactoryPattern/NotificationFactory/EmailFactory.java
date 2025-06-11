package tag17_FactoryPattern.NotificationFactory;

public class EmailFactory extends Notificationfactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification() ;//Diese Fabrik wird ein E-MailNotification-Objekt erzeugen.
    }
}
