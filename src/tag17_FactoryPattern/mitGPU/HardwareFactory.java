package tag17_FactoryPattern.mitGPU;

import tag17_FactoryPattern.FactoryMethodPatternmitInterface.Monitor;

public abstract class HardwareFactory {
    public abstract Monitor createMonitor(String modellName, int bildschirmGroesse, String auflösung);

    public abstract GPU createGPU(String modellName, int speicherGroesse, int energie);

    public abstract RAM createRAM(String modellName, int speicherGroesse, String version);
}
