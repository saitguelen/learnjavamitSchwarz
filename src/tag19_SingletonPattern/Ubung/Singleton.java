package tag19_SingletonPattern.Ubung;

public class Singleton {

    // 🧱 Statische Variable, die die einzige Instanz speichert
    private static Singleton instance;

    // 🔒 Privater Konstruktor verhindert, dass andere Klassen Instanzen erzeugen
    private Singleton() {
        System.out.println("Singleton: Instanz wird erstellt");
    }

    // 🧠 Öffentliche Methode zur Rückgabe der einzigen Instanz (Lazy Initialization)
    // ✅ synchronized macht den Zugriff thread-sicher
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            // 🆕 Instanz wird nur beim ersten Aufruf erstellt
            instance = new Singleton();
        }
        return instance;
    }

    // 🛠️ Eine Beispielmethode, die zeigt, dass die Instanz funktioniert
    public void doSomething() {
        System.out.println("Singleton: Ich mache gerade etwas...");
    }

}
