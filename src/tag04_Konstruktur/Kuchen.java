package tag04_Konstruktur;

public class Kuchen {

    //Attribute

    int mehl;
    int butter;
    int eier;
    int zucker;
    boolean teig=true;
    int stueckeGesamt;
    int stueckeVorhanden;

    public void backen(){

        teig= false;
        System.out.println("Kuchen wurde gebacken!");

    }

    public void essen(int anzahl){

        if(anzahl>stueckeVorhanden){
            System.out.println("Nicht genug Stücke vorhanden! Nur "+stueckeVorhanden);
        }else{
            double faktor =  anzahl / stueckeGesamt;
            mehl -= mehl * faktor;
            butter -= butter * faktor;
            eier -= eier * faktor;
            zucker -= zucker * faktor;

            stueckeVorhanden -= anzahl;
            System.out.println(anzahl + " Stück(e) wurden gegessen.");
        }


    }

    public void showObjektVar(){
        System.out.println("Teig: " + (teig ? "Ja (noch Teig)" : "Nein (schon gebacken)"));
        System.out.println("Mehl: " + mehl + "g");
        System.out.println("Butter: " + butter + "g");
        System.out.println("Eier: " + eier);
        System.out.println("Zucker: " + zucker + "g");
        System.out.println("Gesamtstücke: " + stueckeGesamt);
        System.out.println("Vorhandene Stücke: " + stueckeVorhanden);
        System.out.println("------------------------------");
    }


    }





