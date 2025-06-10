package tag17_FactoryPattern.mitGPU;

public class MsiGPU extends GPU{
    public MsiGPU(String modellName, int speicherGroesse, int energie){
        super(modellName, speicherGroesse, energie);
    }

    @Override
    public String toString() {
        return "MsiGPU==>" +
                "ModellName='" + modellName + '\'' +
                ", SpeicherGröße=" + speicherGroesse + " GB"+
                ", Energie=" + energie +" Watt"+
                '}';
    }
}
