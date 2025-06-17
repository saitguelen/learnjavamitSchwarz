package tag19_SingletonPattern;



public class Zentralbank {
    //Entwurfsmuster: Singelton
    //Ziel: Nur ein Objekt zu erzeugen.

    //Man setzt den Konstruktor auf privat
    //Konsequenz: der Konstruktor ist nur sichtbar innerhalb der Klasse, in der er steht.
    private Zentralbank() {


    }

    private static Zentralbank zentralbank = new Zentralbank();

    //Methode, die das Objekt in dieser Klasse erzeugt.
    //Man bastelt eine statische Methode, der man für gewöhnlich den Namen getInstance() gibt.

    public static Zentralbank getInstance() {
        return zentralbank;
    }

    private double leitzins = 0.5;
    //Getter
    public double getLeitzins() {
        return leitzins;
    }
    //Setter
    public void setLeitzins(double leitzins) {
        if(leitzins > 0.5)
            this.leitzins = leitzins;
    }

}

