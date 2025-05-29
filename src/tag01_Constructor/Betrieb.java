package tag01_Constructor;

public class Betrieb {

    String name;
    String vorname;
    int personalNummer;
    double monatsLohn;

    public Betrieb(String name, String vorname, int personalNummer, double monatsLohn){

        this.name=name;
        this.vorname=vorname;
        this.personalNummer=personalNummer;
        this.monatsLohn=monatsLohn;
    }

    public void prozentSatz(double prozent){

        if(prozent<0){
            prozent= prozent*(-1);
        }
       this.monatsLohn= monatsLohn+(monatsLohn*prozent)/100;

    }

}


