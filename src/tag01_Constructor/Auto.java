package tag01_Constructor;

public class Auto {




    //Attribute

    int baujahr;
    String marke;
    int kilometerstand;
    boolean automatik;
    int preis;

//Konstruktor
    public Auto(){

    }

        public Auto(int pBaujahr, String pMarke, int pKilometerstand, boolean pAutomatik, int pPreis){

            baujahr =pBaujahr;
            marke=pMarke;
            kilometerstand=pKilometerstand;
            automatik=pAutomatik;
            preis=pPreis;
        }



    //Methoden

    public void macheProbefahrt(int pKilometer) {

        kilometerstand = kilometerstand + pKilometer;
    }

    public void aenderePreisUm(int pAenderung) {

        //Überprüfung, ob der Preis nach Änderung noch positiv ist.

        if (preis + pAenderung > 0)

            preis = preis + pAenderung;
        else
            System.out.println("Die Änderung ist nicht zulässig!!!");
    }

}
