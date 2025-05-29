package tag09_10_Vererbung;

public class Girokonto extends Konto{
   private  double limit;

   public Girokonto(String kontonummer, double kontostand, double limit){
       super(kontonummer,kontostand);//wir rufen Konstruktor von Superklasse an!
       this.limit=limit;

   }
   public double getLimit(){
       return limit;
   }
   public void setLimit(double limit){
       this.limit=limit;
   }

   //override
    @Override
    public void auszahlen(double betrag){
       if(getKontostand()-betrag>= -limit){
           super.auszahlen(betrag);
       }else{
           System.out.println("Auszahlung überschreitet Kreditlimit");
       }
    }
}
