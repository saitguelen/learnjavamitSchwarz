package tag04_Vererbung_Lampe;

//Superklasse ist Lampe
//Subklassen sind gluelampe und led lampe

public class Lampe {

    //Attribut

    public int watt;

   //konstruktor...
   public Lampe(int watt){
       this.watt=watt;
   }

   //zur Berechnung erstellen wir eine Methode des jahrlichen Energieverbrauchs
    public int jaehrlicherEnergieVerbrauch(int stundenProTag){

       return (watt*stundenProTag*365)/1000;//Das Ergebnis wird in Kilowattstunden pro Jahr ausgegeben

    }
    //Getter


    public int getWatt() {
        return watt;
    }
}
