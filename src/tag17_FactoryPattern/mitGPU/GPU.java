package tag17_FactoryPattern.mitGPU;

public abstract class GPU {
    protected String modellName;
    protected int speicherGroesse;
    protected int energie;

    public GPU(String modellName, int speicherGroesse, int energie) {
        this.modellName = modellName;
        this.speicherGroesse = speicherGroesse;//in GB
        this.energie = energie;//in Watt
    }

   public abstract  String toString();
}
