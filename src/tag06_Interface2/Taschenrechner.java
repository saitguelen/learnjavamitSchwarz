package tag06_Interface2;

public class Taschenrechner implements Addierbar, Subtrahierbar, Multiplizierbar, Dividierbar {

    @Override
    public double addiere(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrahiere(double a, double b) {
        return a - b;
    }

    @Override
    public double multipliziert(double a, double b) {
        return a * b;
    }

    @Override
    public double dividiere(double a, double b) {
        if (b == 0) {
            System.out.println("NICHT ERLAUBT!!!!!-Fehler: Division durch 0");
            return 0;
        }
        return a / b;
    }
}
