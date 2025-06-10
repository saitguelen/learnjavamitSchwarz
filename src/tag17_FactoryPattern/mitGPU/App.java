package tag17_FactoryPattern.mitGPU;

import tag17_FactoryPattern.FactoryMethodPatternmitInterface.Monitor;
import tag17_FactoryPattern.FactoryMethodPatternmitInterface.MonitorFactory;
import tag17_FactoryPattern.FactoryMethodPatternmitInterface.MsiMonitorFactory;

public class App {
    public static void main(String[] args) {
        //ASUS Produktfamilie erstellen

        HardwareFactory asusFactory = new AsusFactory();
        Monitor asusMonitor=asusFactory.createMonitor("Asus ROG Swift",27,"2560x1440");
        GPU asusGPU=asusFactory.createGPU("Asus ROG Strix",8,200);
        RAM asusRAM=asusFactory.createRAM("Kingston HyperX Fury",16,"DDR4");
        System.out.println("Asus:");
        System.out.println(asusMonitor);
        System.out.println(asusGPU);
        System.out.println(asusRAM);
        System.out.println();

        //MSI Produktfamilie erstellen
        System.out.println("MSI:");
        HardwareFactory msiFactory = new MsiFactory();
        Monitor msiMonitor=msiFactory.createMonitor("MSI optix MAG",24,"1920x1080");
        GPU msiGPU=msiFactory.createGPU("MSI GeForce GTX",6,180);
        RAM msiRAM= msiFactory.createRAM("G.Skill Trident Z5",32,"DDR5");
        System.out.println(msiMonitor);
        System.out.println(msiGPU);
        System.out.println(msiRAM);



    }
}
