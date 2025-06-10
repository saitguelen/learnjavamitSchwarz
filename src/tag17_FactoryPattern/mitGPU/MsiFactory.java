package tag17_FactoryPattern.mitGPU;

import tag17_FactoryPattern.FactoryMethodPatternmitInterface.Monitor;
import tag17_FactoryPattern.FactoryMethodPatternmitInterface.MsiMonitor;

public class MsiFactory extends HardwareFactory{
    @Override
    public Monitor createMonitor(String modellName, int bildschirmGroesse, String auflösung) {
        return new MsiMonitor(modellName, bildschirmGroesse, auflösung);
    }

    @Override
    public GPU createGPU(String modellName, int speicherGroesse, int energie) {
        return new MsiGPU(modellName, speicherGroesse, energie) ;
    }

    @Override
    public RAM createRAM(String modellName, int speicherGroesse, String version) {
        return new MsiRAM(modellName, speicherGroesse, version);
    }
}
