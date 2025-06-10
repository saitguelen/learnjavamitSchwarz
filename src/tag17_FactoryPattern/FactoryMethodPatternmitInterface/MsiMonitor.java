package tag17_FactoryPattern.FactoryMethodPatternmitInterface;

public class MsiMonitor extends Monitor {

    public MsiMonitor(String modellName, int bildschirmGroesse, String auflösung){
        super(modellName, bildschirmGroesse,auflösung);

    }

    @Override
    public String toString() {
        return "MsiMonitor==>" +
                "ModellName='" + modellName + '\'' +
                ", BildschirmGröße=" + bildschirmGroesse +
                ", Auflösung='" + auflösung + '\'' +
                '}';
    }
}
