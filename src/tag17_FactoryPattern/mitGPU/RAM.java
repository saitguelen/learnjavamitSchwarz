package tag17_FactoryPattern.mitGPU;

public abstract class RAM {
    protected  String modellName;
    protected int speicherGroesse;
    protected String version;

    public RAM(String modellName, int speicherGroesse, String version) {
        this.modellName = modellName;
        this.speicherGroesse = speicherGroesse;
        this.version = version;
    }
    public abstract String toString();
}
