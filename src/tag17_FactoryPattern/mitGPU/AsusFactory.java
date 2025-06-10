package tag17_FactoryPattern.mitGPU;

import tag17_FactoryPattern.FactoryMethodPatternmitInterface.AsusMonitor;
import tag17_FactoryPattern.FactoryMethodPatternmitInterface.Monitor;

public class AsusFactory extends HardwareFactory{
    @Override
    public Monitor createMonitor(String modellName, int bildschirmGroesse, String auflösung) {
        return new AsusMonitor(modellName,bildschirmGroesse,auflösung);
    }

    @Override
    public GPU createGPU(String modellName, int speicherGroesse, int energie) {
        return new AsusGPU(modellName, speicherGroesse, energie);
    }

    @Override
    public RAM createRAM(String modellName, int speicherGroesse, String version) {
        return new AsusRAM(modellName,speicherGroesse, version);
    }
}
