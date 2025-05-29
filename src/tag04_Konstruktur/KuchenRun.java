package tag04_Konstruktur;

public class KuchenRun {
    public static void main(String[] args) {


        // 1. Zwei Kuchenobjekte erstellen
        Kuchen kuchen1 = new Kuchen();
        Kuchen kuchen2 = new Kuchen();

        // 2. Objektvariablen setzen
        kuchen1.mehl = 500;
        kuchen1.butter = 200;
        kuchen1.eier = 4;
        kuchen1.zucker = 150;
        kuchen1.stueckeGesamt = 8;
        kuchen1.stueckeVorhanden = 8;

        kuchen2.mehl = 400;
        kuchen2.butter = 100;
        kuchen2.eier = 3;
        kuchen2.zucker = 100;
        kuchen2.stueckeGesamt = 6;
        kuchen2.stueckeVorhanden = 6;

        // 3. Anzeigen vor dem Backen
        System.out.println("Vor dem Backen:");
        kuchen1.showObjektVar();
        kuchen2.showObjektVar();

        // 4. Beide Kuchen backen
        kuchen1.backen();
        kuchen2.backen();

        // 5. Stücke essen
        kuchen1.essen(4);
        kuchen2.essen(3);

        // 6. Anzeigen nach dem Essen
        System.out.println("Nach dem Essen:");
        kuchen1.showObjektVar();
        kuchen2.showObjektVar();
    }
}


