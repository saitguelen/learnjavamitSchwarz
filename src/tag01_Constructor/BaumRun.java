package tag01_Constructor;

public class BaumRun {

    public static void main(String[] args) {

        // 1--->Zwei Baum objekte erstellen(erzeugen)

        Baum baum1 = new Baum(2015,4.5,3.2,"Kugel",false);
        Baum baum2 = new Baum(2010,7.2,4.1,"Säule",true);

        // 2--->Anzeige
        System.out.println("Erste Anzeige: ");
        baum1.showObjektVar();
        baum2.showObjektVar();

        // 3--->Ändern höhe eines Baums

        baum1.setHoehe(5.0);

        // 4. Krankheitszustand ändern

        baum2.setKrank(false);

        baum1.setAusdehnung(15.5);

        baum1.setKrank(true);
        baum2.setHoehe(55.5);

        //Erneut anzeigen

        System.out.println("Nach Änderungen: ");
        baum1.showObjektVar();
        baum2.showObjektVar();
    }
}
