package tag17_FactoryPattern.NotificationFactory;


/*Es werden verschiedene Arten von Benachrichtigungen an die Benutzer im System gesendet:
 - E-Mail - SMS - Push-Benachrichtigung
 Je nach Art der Benachrichtigung sollte die entsprechende Klasse ausgewählt werden.
 Das System wird dank der Factory Method erweiterbar sein.*/


public interface Notification {
    void notifyUser();
}
