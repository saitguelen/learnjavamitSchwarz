package tag01_Constructor;

public class BetriebRun {

    public static void main(String[] args) {
        Betrieb sait = new Betrieb("Gülen","Sait", 1001,10000);

        System.out.println("name:" +sait.name+ "\nvorname: "+sait.vorname+ "\npersonalnummer: "+sait.personalNummer+ "\nmonatslohn: "+sait.monatsLohn);

        //sait.prozentSatz(15);
        //sait.prozentSatz(15.5);
        sait.prozentSatz(10);

        System.out.println( "Neues monatslohn: "+sait.monatsLohn);
    }
}
