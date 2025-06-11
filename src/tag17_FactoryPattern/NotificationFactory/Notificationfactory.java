package tag17_FactoryPattern.NotificationFactory;

public abstract class Notificationfactory {
    public abstract Notification createNotification();

    public void send() {
        Notification notification = createNotification();//Diese Zeile ruft die Methode createNotification() auf,
                                                            // die von der Unterklasse überschrieben wird.
        notification.notifyUser();
    }
}
