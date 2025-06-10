package tag17_FactoryPattern.mitGPU;

public class AsusGPU extends GPU{

    public AsusGPU(String modellName, int speicherGroesse, int energie){
        super( modellName,speicherGroesse, energie);
    }

    @Override
    public String toString() {
        return "AsusGPU==>" +
                "ModellName='" + modellName + '\'' +
                ", SpeicherGröße=" + speicherGroesse + " GB"+
                ", Energie=" + energie +" Watt"+
                '}';
    }
}
