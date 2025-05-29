package tag04_Vererbung;

public class MacBook extends Laptop{
    boolean touchBar;

    public MacBook(String marke, int ram, String cpu, double preis, boolean touchBar){
        super(marke, ram,cpu,preis);
        this.touchBar=touchBar;
    }

    @Override
    public String toString() {
        return "MacBook==>" +
                "touchBar=" + touchBar +
                ", Marke='" + marke + '\'' +
                ", Ram=" + ram +
                ", CPU='" + cpu + '\'' +
                ", Preis=" + preis +
                '}';
    }
}
