package tag19_SingletonPattern.Ubung;

public class SingletonTest {
    public static void main(String[] args) {

        // 🧵 Eine Aufgabe, die eine Singleton-Instanz verwendet
        Runnable task = () -> {
            // 🧱 Singleton-Instanz abrufen
            Singleton singleton = Singleton.getInstance();

            // 🛠️ Eine Beispielmethode aufrufen
            singleton.doSomething();

            // 🧾 Den Hashcode der Instanz ausgeben (zur Kontrolle)
            System.out.println("Instanz-Hashcode: " + singleton.hashCode());
        };

        // 🧪 Drei verschiedene Threads erzeugen
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        // ▶️ Threads starten – alle versuchen auf dieselbe Instanz zuzugreifen
        t1.start();
        t2.start();
        t3.start();
    }
}
