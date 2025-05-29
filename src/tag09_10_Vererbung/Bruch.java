package tag09_10_Vererbung;

public class Bruch {//Kesir

    private int zaehler;//pay
    private int nenner;//payda

    Bruch(){                                       //Default KOnstruktor zaehler= 0 und nenner=1 wird angenommen
        this.zaehler=0;                             //Bilde den Bruch, wenn nur der Zähler gegeben ist. nenner = 1 wird angenommen
        this.nenner=1;

    }Bruch(int zaehler){
        this.zaehler=zaehler;
        this.nenner=1;
    }
    Bruch(int zaehler,int nenner){
        this.zaehler=zaehler;
        this.nenner=nenner;
    }
    public void setZaehler(int z){
        zaehler=z;
    }
    public void setNenner(int n){
        nenner=n;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }
    public void ausgeben(){
        System.out.println(zaehler+"/"+nenner);
    }
    public String bruchToString(){
        return  zaehler+"/"+nenner;
    }
    public boolean kuerzen(){
        int m,n,r; // Lokale Variablen
        m=Math.abs(zaehler);
        n =Math.abs(nenner);
        r=m%n;
        while (r>0){
            m=n;
            n=r;
            r=m%n;
        }
        zaehler /= n;
        nenner /= n;

        return false;
    }
    public void gekuerztausgeben(){
        kuerzen();
        ausgeben();
    }
    public boolean equals(Bruch x){
        var a = new Bruch(this.zaehler, this.nenner);
        var b = new Bruch(x.zaehler,x.nenner);
        a.kuerzen();
        b.kuerzen();
        if((a.zaehler==b.zaehler) && (a.nenner==b.nenner)){
            return true;
        }else{
            return false;
        }
    }
    public Bruch addiere(Bruch b){
        int neuerZaehler=this.zaehler* b.nenner+b.zaehler*this.nenner;
        int neuerNenner=this.nenner*b.nenner;
        return new Bruch(neuerZaehler,neuerNenner);
    }
    public Bruch subtrahiere(Bruch b){
        int neuerZaehler=this.zaehler*b.nenner-b.zaehler*this.nenner;
        int neuerNenner=this.nenner*b.nenner;
        return  new Bruch(neuerZaehler,neuerNenner);
    }
    public double dezimalwert(){
        return (double) zaehler/nenner;
    }

    public void anzeigen(){
        System.out.println(zaehler+ "/"+ nenner);
    }
}
