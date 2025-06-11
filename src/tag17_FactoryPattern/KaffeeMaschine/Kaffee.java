package tag17_FactoryPattern.KaffeeMaschine;
/*Der Benutzer wählt die Art des Kaffees aus
→ Das System erstellt das richtige Kaffeeobjekt und serviert den Instantkaffee.
(Kaffeearten: Latte, Cappuccino, Milchkaffee)

com.sait.kaffee
├── Kaffee.java                 // Interface
├── Latte.java                 // Concrete Product
├── Cappuccino.java
├── Milchkaffee.java
├── KaffeeFactory.java         // Abstrakte Klasse
├── LatteFactory.java          // Concrete Factory
├── CappuccinoFactory.java
├── MilchkaffeeFactory.java
└── Main.java
*/
public interface Kaffee {
    void zubereiten();
}
