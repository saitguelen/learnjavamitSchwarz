package tag04_Vererbung_Lampe;
//wird von Lampe vererbt
public class Gluehlampe extends Lampe {

    public Gluehlampe(int watt){
        super(watt);
    }

    public String toString(int stundenProTag){
        int verbrauch =jaehrlicherEnergieVerbrauch(stundenProTag);
        return "Eine Glühlampe verbraucht " + verbrauch + " kWh pro Jahr.";
    }
}
