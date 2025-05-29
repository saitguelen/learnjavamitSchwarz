package tag04_Vererbung_Lampe;

public class LEDLampe extends Lampe {

    public LEDLampe(int watt){
        super(watt);
    }
    public String toString(int stundenProTag){
        int verbrauch = jaehrlicherEnergieVerbrauch(stundenProTag);
        return "Eine LED-Lampe verbraucht " + verbrauch + " kWh pro Jahr.";
    }
}
