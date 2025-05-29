package tag01_Constructor;

public class Auto1Run {

    public static void main(String[] args) {
        // Variable vom Typ Auto
        //Deklaration einer Referenzvariable = Konstruktoraufruf/Erzeugung eines Objektes
        Auto1 meinAuto = new Auto1(2013, "Fiat Punto", 84000, false, 4500);

        System.out.println(meinAuto.getBaujahr());//2013
        meinAuto.macheProbefahrt(10);
        System.out.println(meinAuto.getKilometerstand());
        meinAuto.aenderePreisUm(50);
        System.out.println(meinAuto.getPreis());


    }

}
