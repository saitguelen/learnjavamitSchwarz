package tag17_FactoryPattern.NotificationFactory;

public class PushFactory extends Notificationfactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();//Diese Fabrik wird ein PushNotification-Objekt erzeugen.bu fabrika push üretecek
    }
}
