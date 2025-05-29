package tag06_Abstract;

public abstract class GeometrischeFigur {

    protected double x;
    protected double y;                     //auf diese variablen nur von dieser klasse und ihren subklassen zugegriffen werden kann

    //Und dann erstellen wir Konstruktor damit aufgerufen wird


    public GeometrischeFigur(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //Danach berechenen wir Umfang
    public abstract double berechneUmfang();//wird diese methode hier nicht definiert, Subklassen müssen für ihre spezifische form implementieren

    //wie Umfang erstellen wir Fläache
    public abstract double berechneFlaeche();

    //für Ausgabe
    public void anzeigen(){
        System.out.println("Startpunkt (X, Y): (" + x + ", " + y + ")");
    }


}
