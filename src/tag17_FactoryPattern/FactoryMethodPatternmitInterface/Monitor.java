package tag17_FactoryPattern.FactoryMethodPatternmitInterface;

public abstract class Monitor {
    protected String modellName;
    protected int bildschirmGroesse;
    protected String auflösung;

    public Monitor(String modellName, int bildschirmGroesse, String auflösung) {
        this.modellName = modellName;
        this.bildschirmGroesse = bildschirmGroesse;
        this.auflösung = auflösung;
    }

    public abstract String toString();
}
