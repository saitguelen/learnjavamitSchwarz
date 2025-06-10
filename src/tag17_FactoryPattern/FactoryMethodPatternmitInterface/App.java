package tag17_FactoryPattern.FactoryMethodPatternmitInterface;

public class App {
    public static void main(String[] args) {
        MonitorFactory asusFactory = new AsusMonitorFactory();
        MonitorFactory msiFactory = new MsiMonitorFactory();

        Monitor asusMonitor= asusFactory.createMonitor("Asus ROG Swift",27,"2560*1440");
        System.out.println(asusMonitor);
        Monitor msiMonitor = msiFactory.createMonitor("MSI Optix MAG",24,"1920*1080");
        System.out.println(msiMonitor);

    }
}
