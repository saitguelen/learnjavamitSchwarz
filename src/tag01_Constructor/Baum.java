package tag01_Constructor;

import java.util.Calendar;

public class Baum {

    //Objektvariablen
    private int pflanzjahr;
    private double ausdehnung;
    private  double hoehe;
    private  String form;
    private  boolean krank;

    //Konstruktor

    public Baum(int pflanzjahr, double ausdehnung, double hoehe, String form, boolean krank){
        this.pflanzjahr=pflanzjahr;
        this.ausdehnung= ausdehnung;
        this.hoehe= hoehe;
        this.form= form;
        this.krank=krank;

    }
    //  AltersBerechnung, erstellen wir eine Method um alter zu berechnen

    public int alter(){
        int aktuellesJahr= Calendar.getInstance().get(Calendar.YEAR);
        return aktuellesJahr-pflanzjahr;
    }
    // Getter und Setter für Krank

    public void setKrank(boolean krank){ //Setter
        this.krank=krank;
    }
    public boolean isKrank(){ //Getter //ve diger dikkat edilecek husus: boolean'da get yerine'is' yazilir
        return krank;
    }

    //Getter ve Setter für Ausdehnung

    //Setter private
    public void setAusdehnung(double ausdehnung){
        this.ausdehnung=ausdehnung;
    }
    //Getter für Ausdehnung

    public double getAusdehnung(){
        return ausdehnung;
    }
    //Getter ve Setter für Höhe

    //Setter private höhe
    public void setHoehe(double hoehe){
        this.hoehe=hoehe;
    }
    //Getter für höhe

    public double getHoehe(){
        return hoehe;
    }

    //Objektdaten anzeigen

    public void showObjektVar(){
        System.out.println("Pflanzjahr: " + pflanzjahr);
        System.out.println("Ausdehnung: " + ausdehnung + " m²");
        System.out.println("Hoehe: " + hoehe + " m");
        System.out.println("Form: " + form);
        //System.out.println("Krank: " + krank);

        if(krank)
            System.out.println("Baum ist krank");
        else
            System.out.println("Baum ist gesund!");
        System.out.println("Alter: " + alter() + " Jahre");
        System.out.println("-------------------------");

    }


}
