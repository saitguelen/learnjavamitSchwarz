package tag04_Vererbung;

public class Laptop {

    //Attribute
    String marke;
    int ram;
    String cpu;
    double preis;

    //Konstruktur mit allen Parametern


    public Laptop(String marke, int ram, String cpu, double preis) {
        this.marke = marke;
        this.ram = ram;
        this.cpu = cpu;
        this.preis = preis;
    }

    public  void starten(){
        System.out.println("Laptop startet....");
    }
}
