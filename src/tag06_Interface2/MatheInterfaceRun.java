package tag06_Interface2;

public class MatheInterfaceRun {
    public static void main(String[] args) {

        Taschenrechner r1= new Taschenrechner();

        double a=12;
        double b=3;

        System.out.println("Addition: " + r1.addiere(a, b));
        System.out.println("Subtraktion: " + r1.subtrahiere(a, b));
        System.out.println("Multiplikation: " + r1.multipliziert(a, b));
        System.out.println("Division: " + r1.dividiere(a, b));
        System.out.println("============================================");


        Taschenrechner r2= new Taschenrechner();

        double x=12;
        double y=6;

        System.out.println("Addition: " + r2.addiere(x, y));
        System.out.println("Subtraktion: " + r2.subtrahiere(x, y));
        System.out.println("Multiplikation: " + r2.multipliziert(x, y));
        System.out.println("Division: " + r2.dividiere(x, y));



    }
}
