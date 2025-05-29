package tag03_toString;

public class Person {
    //Die toString()-Methode
    //Wir können diese Methode überschreiben
    //Methdonname bleibt gleich aber auch die Parameterliste. Nur der Zugriffmodifizierer darf sich ggf. unterscheiden.
    //Ziel: Dass wir mit dem Namens des Objekts eine vernüfte Ausgabe in der Konsole haben
    //und nicht den Hashcode (also Klassenname@Hashcode)


    //Attribute
    private String vorname;
    private String nachname;
    private int alter;

    //Parametrisierter Konstruktor
    public Person(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }


    @Override
    public String toString() {
        return "Vorname: " + vorname + ", Nachname: " + nachname + ", Alter: " + alter;
    }


    public static void main(String... strings) {
        Person person = new Person("Max", "Mustermann", 40);
        System.out.println(person);


    }


}
