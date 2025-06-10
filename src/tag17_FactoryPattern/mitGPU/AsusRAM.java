package tag17_FactoryPattern.mitGPU;

public class AsusRAM extends RAM{
    public AsusRAM(String modellName, int speicherGroesse, String version){
        super(modellName, speicherGroesse, version);
    }

    @Override
    public String toString() {
        return "AsusRAM==>" +
                "ModellName='" + modellName + '\'' +
                ", SpeicherGröße=" + speicherGroesse +" GB"+
                ", Version='" + version + '\'' +
                '}';
    }
}
