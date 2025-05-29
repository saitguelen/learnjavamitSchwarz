package tag04_Schrank;

public class Schrank {

    //Attribute

    private String name;
    private double[] abmessung;    //[länge, breite, höhe]
    private  double preis;
    private static  int zaehler = 0 ;  //Wie vielen Schrank produziert?

    //Konstruktur mit allen Parametern

    public Schrank(String name, double laenge, double breite, double hoehe, double preis){
         this.name=name;
         this.abmessung=new double[]{laenge,breite,hoehe};
         this.preis=preis;
         zaehler++;
    }

    // Vorbereitete Model 1
    public Schrank() {
        this("Standard A", 1.0, 0.5, 2.0, 150.0);
    }

    // Vorbereitete Model 2
    public Schrank(String name) {
        this(name, 1.2, 0.6, 2.2, 180.0);
    }
    //Volume Mehode
    public double getVolumen(){
        return abmessung[0]*abmessung[1]*abmessung[2];
    }
    public double getPreis(){
        return this.preis;
    }

    public String getInfo(){
        return "Name: " + name +
                ", Maße (L×B×H): " + abmessung[0] + "×" + abmessung[1] + "×" + abmessung[2] +
                ", Volumen: " + getVolumen() + " m³" +
                ", Preis: " + preis + " €";
    }

    public static int getAnzahl() {
        return zaehler;
    }


}
