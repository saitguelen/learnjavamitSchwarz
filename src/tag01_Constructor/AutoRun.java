package tag01_Constructor;

public class AutoRun {

    public static void main(String[] args) {


        //Variable vom Typ Auto

        Auto meinAuto = new Auto();
        Auto meinAuto2 = new Auto();
        Auto meinAuto3=new Auto(2023,"Aston Martin",84000,false,25000);

        System.out.println(meinAuto3.marke);
        System.out.println(meinAuto3.baujahr);
        System.out.println(meinAuto3.kilometerstand);
        System.out.println(meinAuto3.automatik);
        System.out.println(meinAuto3.preis);
        System.out.println();

        meinAuto.baujahr= 2023;
        meinAuto.marke= "Volkswagen Touran";
        meinAuto.kilometerstand=179000;
        meinAuto.automatik= true;
        meinAuto.preis=7500;



        meinAuto2.baujahr= 2013;
        meinAuto2.marke= "Mercedes Benz E 200";
        meinAuto2.kilometerstand=79000;
        meinAuto2.automatik= false;
        meinAuto2.preis=10000;

        System.out.println("baujahr: " +meinAuto.baujahr);
        System.out.println(meinAuto.marke);
        System.out.println(meinAuto.kilometerstand);
        System.out.println(meinAuto.automatik);
        System.out.println(meinAuto.preis);

        System.out.println();

        meinAuto.macheProbefahrt(100);
        System.out.println(meinAuto.kilometerstand);

        System.out.println();

        meinAuto.aenderePreisUm(500);
        System.out.println(meinAuto.preis);
        System.out.println();

        System.out.println("Neues Auto");




        System.out.println(meinAuto2.baujahr);
        System.out.println(meinAuto2.marke);
        System.out.println(meinAuto2.kilometerstand);
        System.out.println(meinAuto2.automatik);
        System.out.println(meinAuto2.preis);

        System.out.println();

        meinAuto2.macheProbefahrt(100);
        System.out.println(meinAuto2.kilometerstand);

        System.out.println();

        meinAuto2.aenderePreisUm(500);
        System.out.println(meinAuto2.preis);




    }

}




