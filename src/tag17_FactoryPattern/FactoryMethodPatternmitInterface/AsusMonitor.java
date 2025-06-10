package tag17_FactoryPattern.FactoryMethodPatternmitInterface;

public class AsusMonitor extends Monitor {         //für alle offen

/*Asus marka bir monitörü temsil eden sınıf.
İçinde sadece bir display() metodu olacak,
bu metod monitörün çalıştığını göstermek için bir mesaj yazdıracak.

Klasse, die einen Monitor der Marke Asus repräsentiert.
Es wird nur eine display()-Methode geben, die eine Meldung ausgibt,
um zu zeigen, dass der Monitor funktioniert.
*/
    public AsusMonitor(String modellName, int bildschirmGroesse, String auflösung){
        super(modellName,bildschirmGroesse,auflösung);
    }

    @Override
    public String toString() {
        return "AsusMonitor==>" +
                "ModellName='" + modellName + '\'' +
                ", BildschirmGröße=" + bildschirmGroesse +
                ", Auflösung='" + auflösung + '\'' +
                '}';
    }
}

