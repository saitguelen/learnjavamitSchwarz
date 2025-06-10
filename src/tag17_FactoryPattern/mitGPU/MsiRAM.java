package tag17_FactoryPattern.mitGPU;

public class MsiRAM extends RAM{
    public MsiRAM(String modellName, int speicherGroesse, String version) {
        super(modellName, speicherGroesse, version);
    }

    @Override
    public String toString() {
        return "MsiRAM==>" +
                "ModellName='" + modellName + '\'' +
                ", SpeicherGröße=" + speicherGroesse +" GB"+
                ", Version='" + version + '\'' +
                '}';
    }
}
