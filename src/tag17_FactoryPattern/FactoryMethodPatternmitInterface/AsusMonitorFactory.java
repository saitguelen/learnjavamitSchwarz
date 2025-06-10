package tag17_FactoryPattern.FactoryMethodPatternmitInterface;

public class AsusMonitorFactory extends MonitorFactory{
    @Override
    public Monitor createMonitor(String modellName, int bildschirmGroesse, String auflösung){
        return new AsusMonitor(modellName, bildschirmGroesse,auflösung);
    }
}
