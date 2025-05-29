package tag06_Abstract;

public class Kreis extends GeometrischeFigur {

    private double radius;

    //Konstruktur

    public Kreis(double x, double y, double radius) {
        super(x, y);//von eltern klasse
        this.radius = radius;
    }
    //Getter und Setter für Radius

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneUmfang() {
        return 2 * Math.PI * radius;

    }

    @Override
    public double berechneFlaeche() {
        return Math.PI * radius * radius;
    }

    @Override
    public void anzeigen() {
        super.anzeigen(); // Ruft die Methode der Superklasse auf.
        System.out.println("Radius: " + radius);

    }
}
