package tag04_Schrank;

public class SchrankRun {

    public static void main(String... args) {

        //neue objekt erstellen

        Schrank s1 = new Schrank();
        Schrank s2 = new Schrank("Model B");
        Schrank s3 = new Schrank("luxus",1.0,0.8,2.5,320.0);
        Schrank s4= new Schrank("Merzi",2.5,1.5,3.0,120.0);

        System.out.println(s1.getInfo());
        System.out.println(s2.getInfo());
        System.out.println(s3.getInfo());
        System.out.println(s4.getInfo());

        System.out.println("Gesamtanzahl der Schränke: "+ Schrank.getAnzahl());
    }
}
