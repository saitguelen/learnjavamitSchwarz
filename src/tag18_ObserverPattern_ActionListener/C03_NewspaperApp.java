package tag18_ObserverPattern_ActionListener;

public class C03_NewspaperApp {
    public static void main(String[] args) {
        // 1. Birdzeitung (Observable) erstellt Subjekt wird
        C01_Birdzeitung_Subjekt birdzeitung = new C01_Birdzeitung_Subjekt("Vol. 1 - The First Flight");

        // 2. Zeitungsabo (Observer) Objekte erstellen
        C02_Zeitungsabo_Beobachter abonement1 = new C02_Zeitungsabo_Beobachter("Sait");
        C02_Zeitungsabo_Beobachter abonement2 = new C02_Zeitungsabo_Beobachter("Ayşe");
        C02_Zeitungsabo_Beobachter abonement3 = new C02_Zeitungsabo_Beobachter("Mehmet");

        // 3. Observer'ları Observable'a kaydet (Abonelikleri yap)  Beobachter in Observable speichern (Abonnements erstellen)
        birdzeitung.addObserver(abonement1); //  Sait hat die Zeitung abonniert
        birdzeitung.addObserver(abonement2); // Ayşe  hat die Zeitung abonniert

        System.out.println("\n---  Erste Abonnenten registriert---");

        // 4. Gazete yeni bir sayı çıkardığında (durum değiştiğinde)
        birdzeitung.newIssueReleased("Band 2 - Saison der Migration"); // Bu, Dadurch werden die Beobachter informieren
                                                                    /*Wenn birdzeitung.newIssueReleased("...");
                                                                    aufgerufen wird, werden die Methoden setChanged()
                                                                    und notifyObservers() in Birdzeitung ausgeführt.
                                                                    Dies löst die update()-Methode aller registrierten Zeitungsabo aus.*/


        System.out.println("\n---Mehmet tritt nach der Anmeldung bei ---");
        // Mehmet abonnieren später
        birdzeitung.addObserver(abonement3); // Mehmet hat die Zeitung abonniert

        System.out.println("\n--- Eine weitere neue Ausgabe ist erschienen ---");
        birdzeitung.newIssueReleased("Band 3 - Tipps zum Nestbau"); // Observer'lar tekrar bilgilendirilecek

        // Wir wollen einen Abonnenten abbestellen  Bir aboneyi abonelikten çıkaralım
        System.out.println("\n---Ayşe wird abgemeldet ---");
        birdzeitung.deleteObserver(abonement2); //Ayşe kündigt ihr Abonnement

        System.out.println("\n---Letzte Ausgabe erscheint  ---");
        birdzeitung.newIssueReleased("Vol. 4 - Winter Survival (Band 4 - Überleben im Winter)"); //  Die übrigen Beobachter werden benachrichtigt Kalan Observer'lar bilgilendirilecek
    }
    }

    /*Kurze Zusammenfassung Wir haben das Observer Pattern in den Beispielen Birdzeitung und Zeitungsabo erfolgreich umgesetzt:
    - Die Klasse Vogelzeitung erbt von der Klasse java.util.Observable und erweitert diese, um die Rolle des "Observable" zu übernehmen.
    - Die Klasse Zeitungsabo hat die Rolle des "Observers" übernommen, indem sie die Schnittstelle java.util.Observer implementiert.
    - Mit addObserver() werden Abonnenten für die Zeitung registriert.
     Wenn es eine Änderung in der Zeitung gibt (wenn die newIssueReleased-Methode aufgerufen wird),
    werden alle registrierten Abonnenten dank der setChanged()- und notifyObservers()-Methoden automatisch benachrichtigt,
    und die update()-Methoden funktionieren

    Kısa Özet (Kurze Zusammenfassung)
Birdzeitung ve Zeitungsabo örneklerinde Observer Pattern'i başarıyla uyguladık:
Birdzeitung sınıfı, java.util.Observable sınıfından miras alarak (extend ederek) "Gözlemlenebilir" (Observable) rolünü üstlendi.
Zeitungsabo sınıfı, java.util.Observer arayüzünü uygulayarak (implement ederek) "Gözlemci" (Observer) rolünü üstlendi.
addObserver() ile aboneler gazeteye kaydedildi.
Gazetede bir değişiklik olduğunda (newIssueReleased metodu çağrıldığında), setChanged() ve notifyObservers()
metotları sayesinde tüm kayıtlı aboneler otomatik olarak bilgilendirildi ve update() metotları çalıştı*/

